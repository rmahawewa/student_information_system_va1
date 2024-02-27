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
import Model.Grade;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    
    public int add_students_to_grade_exam(int exam_grade_id, int grade_id, String year){
        int return_status= 1;
        Grade g = new Grade();
        int grade_in_number = g.get_grade_in_number(grade_id);
        
        PreparedStatement prep1 = null;
        PreparedStatement prep2 = null;
        ResultSet result = null;
        
        //String query = "select student_id from student where grade_in_year_of_entarance = (select ? - TIMESTAMPDIFF(YEAR, student.year_of_entarance, CURDATE())) and is_current_student = ?";
        String query = "select student_id from student where grade_in_year_of_entarance = (select ? - TIMESTAMPDIFF(YEAR, student.year_of_entarance, ?)) and is_current_student = ?";
        try {
            prep1 = con.prepareStatement(query);
            prep1.setInt(1, grade_in_number);
            prep1.setDate(2, java.sql.Date.valueOf(year + "-01-01"));
            prep1.setInt(3, 1);
            result = prep1.executeQuery();
//            List<Integer> l = new ArrayList<Integer>();
//            int count = 0;
              String query1 = "";
            while(result.next()){
//                l.add(count, result.getInt("student_id"));
//                count++;                
                query1 = "insert into student_grade_exam (student_id, grade_exam_id, record_created_at, record_created_by) values (?,?,?,?)";
                prep2 = con.prepareStatement(query1);
                prep2.setInt(1, result.getInt("student_id"));
                prep2.setInt(2, exam_grade_id);
                prep2.setTimestamp(3, Timestamp.valueOf(this.record_created_or_updated_at));
                prep2.setInt(4, this.record_created_or_updated_by);
                prep2.executeUpdate();
                
                if(prep2 != null){
                    try{
                        prep2.close();
                    }catch(Exception e){}
                    prep2 = null;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExam.class.getName()).log(Level.SEVERE, null, ex);
            return_status = -1;
        }finally{
            if(prep1 != null){
                try{
                    prep1.close();
                }catch(Exception e){}
                prep1 = null;
            }
            if(prep2 != null){
                    try{
                        prep2.close();
                    }catch(Exception e){}
                    prep2 = null;
            }
            if(result != null){
                try{
                    result.close();
                }catch(Exception e){}
                result = null;
            }
        }     
        return return_status;
    }
    
}
