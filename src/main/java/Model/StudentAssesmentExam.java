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
            prep.setInt(1, student_id);
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
    
    public HashMap get_student_exam_assesment_list(String student, String exam, String assesment){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int count = 1;
        int count_student = 0;
        int count_exam = 0;
        int count_assesment = 0;
        
        String qry_student = "";
        String qry_exam = "";
        String qry_assesment = "";
        
        int cnt = 0;
        HashMap<Integer, Map<Integer, String>> hm = new HashMap<Integer, Map<Integer, String>>();
        
        String query = "select student_assesment_exam_id, student_name, assesment_name, exam_name, marks from student_assesment_exam inner join student on student_assesment_exam.student_id = student.student_id inner join exam_assesment on student_assesment_exam.exam_assesment_id = exam_assesment.e_a_id inner join exam on exam_assesment.exam_id = exam.exam_id inner join assesment on exam_assesment.assesment_id = assesment.assesment_id where student_assesment_exam.student_assesment_exam_id > ?";
        
        if(!student.equals("")){
            qry_student = " and student_name like ?";
            
            count++;
            count_student = count;
        }
        
        if(!exam.equals("")){
            qry_exam = " and exam_name like ?";
            
            count++;
            count_exam = count;
        }
        
        if(!assesment.equals("")){
            qry_assesment = " and assesment_name like ?";
            
            count++;
            count_assesment = count;
        }
        
        query = query + qry_student + qry_exam + qry_assesment;
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            
            if(!student.equals("")){
                prep.setString(count_student, "%" + student + "%");
            }

            if(!exam.equals("")){
                prep.setString(count_exam, "%" + exam + "%");
            }

            if(!assesment.equals("")){
                prep.setString(count_assesment, "%" + assesment + "%");
            }
            
            result = prep.executeQuery();
            while(result.next()){
                String id = Integer.toString(result.getInt("student_assesment_exam_id"));
                String std_name = result.getString("student_name");
                String asmt_name = result.getString("assesment_name");
                String exm_name = result.getString("exam_name");
                String mrks = result.getString("marks");
                
                HashMap<Integer, String> mp = new HashMap<Integer, String>();
                mp.put(0, id);
                mp.put(1, std_name);
                mp.put(2, asmt_name);
                mp.put(3, exm_name);
                mp.put(4, mrks);
                
                hm.put(cnt, mp);
                cnt++;
                  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;        
    }
    
    public HashMap get_unique_record_by_id(int id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        HashMap<Integer, String> hm = new HashMap<Integer,String>(); 
        
        String query = "select marks, remarks, description from student_assesment_exam where student_assesment_exam_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, id);
            result = prep.executeQuery();
            while(result.next()){
                hm.put(0, result.getString("marks"));
                hm.put(1, result.getString("remarks"));
                hm.put(2, result.getString("description"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
    
    public int update_student_assesment_exam(){
        PreparedStatement prep = null;
        int i = 0;
        
        String query = "update student_assesment_exam set marks = ?, remarks = ?, description = ? where student_assesment_exam_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getMarks());
            prep.setString(2, this.getRemarks());
            prep.setString(3, this.getDescription());
            prep.setInt(4, this.getStd_asmt_exam_id());
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
}
