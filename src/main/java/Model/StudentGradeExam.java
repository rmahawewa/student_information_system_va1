/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import java.time.LocalDateTime;
import Model.LoggedInUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentGradeExam {
    
    private int student_grade_exam_id;
    private int student_id;
    private int exam_grade_id;
    private String marks;
    private String remarks;
    private String description;
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public StudentGradeExam() {
        
    }

    public int getStudent_grade_exam_id() {
        return student_grade_exam_id;
    }

    public void setStudent_grade_exam_id(int student_grade_exam_id) {
        this.student_grade_exam_id = student_grade_exam_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int setExam_grade_id_id() {
        return exam_grade_id;
    }

    public void getExam_grade_id(int exam_grade_id) {
        this.exam_grade_id = exam_grade_id;
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
    
    public HashMap get_student_exam_records_by_student_id(int student_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int cnt = 0;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        
        String query = "select student_grade_exam_id, marks, exam_name, grade_in_words, date_and_time from student_grade_exam inner join grade_exam on student_grade_exam.grade_exam_id = grade_exam.g_e_id inner join grade on grade_exam.gd_id = grade.grade_id inner join exam on grade_exam.em_id = exam.exam_id where student_grade_exam.student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1,student_id);
            result = prep.executeQuery();
            while(result.next()){
                String d_and_t = result.getString("date_and_time");
                String grade = result.getString("grade_in_words");
                String exam = result.getString("exam_name");
                String marks = result.getString("marks");
                String id = Integer.toString(result.getInt("student_grade_exam_id"));
                
                HashMap<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, d_and_t);
                mp.put(1, grade);
                mp.put(2, exam);
                mp.put(3, marks);
                mp.put(4, id);
                
                hm.put(cnt, mp);
                cnt++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;        
    }
    
}
