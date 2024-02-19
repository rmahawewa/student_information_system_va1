/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.LoggedInUser;
import java.time.LocalDateTime;
import DatabaseConnection.ConnectionString;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentAssesmentExam {
    
    private int std_asmt_exam_id;
    private int exam_asmt_id;
    private int stdnt_id;
    private String marks;
    private String remarks;
    private String description;
    private int created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public StudentAssesmentExam() {
    }

    public int getStd_asmt_exam_id() {
        return std_asmt_exam_id;
    }

    public void setStd_asmt_exam_id(int std_asmt_exam_id) {
        this.std_asmt_exam_id = std_asmt_exam_id;
    }

    public int getExam_asmt_id() {
        return exam_asmt_id;
    }

    public void setExam_asmt_id(int exam_asmt_id) {
        this.exam_asmt_id = exam_asmt_id;
    }

    public int getStdnt_id() {
        return stdnt_id;
    }

    public void setStdnt_id(int stdnt_id) {
        this.stdnt_id = stdnt_id;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public int add_student_assesment_exam_record(){
        int r=-1;
        PreparedStatement prep = null;
        
        String query = "insert into student_assesment_exam (exam_assesment_id, student_id, marks, remarks, description, record_created_by, record_created_at) values (?,?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, this.exam_asmt_id);
            prep.setInt(2, this.stdnt_id);
            prep.setString(3, this.marks);
            prep.setString(4, this.remarks);
            prep.setString(5, this.description);
            prep.setInt(6, this.created_or_updated_by);
            prep.setTimestamp(7, Timestamp.valueOf(created_or_updated_at));
            r=prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;        
    }
    
    public HashMap get_student_assesment_exam_details_by_studentid(int student_id){
        PreparedStatement prep = null;
        ResultSet rs = null;
        int cnt = 0;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();        
        
        String query = "select student_assesment_exam.student_assesment_exam_id, exam_assesment.date_and_time, assesment.assesment_name, exam.exam_name from student_assesment_exam inner join exam_assesment on student_assesment_exam.exam_assesment_id = exam_assesment.e_a_id inner join exam on exam_assesment.exam_id = exam.exam_id inner join assesment on exam_assesment.assesment_id = assesment.assesment_id where student_assesment_exam.student_id = ?";
        try {
            prep = con.prepareStatement(query);
            rs = prep.executeQuery();
            while(rs.next()){
                String id = Integer.toString(rs.getInt("student_assesment_exam.student_assesment_exam_id"));
                String datetime = rs.getString("exam_assesment.date_and_time");
                String assesment_name = rs.getString("assesment.assesment_name");
                String exam_name = rs.getString("exam.exam_name");
                HashMap<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, datetime);
                mp.put(1, assesment_name);
                mp.put(2, exam_name);
                mp.put(3, id);
                hm.put(cnt, mp);
                cnt++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
}
