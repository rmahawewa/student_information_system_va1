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
    
    public HashMap get_student_exam_records_by_student_id(int student_id) throws SQLException{
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
        } finally{
            
            if(result != null){
                try{
                    result.close();
                }catch(SQLException e){}
                result=null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep.close();
            }
            con.close();        
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
    
    public HashMap get_record_list_by_filtering(String student, String exam, String grade){
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        int cnt = 0;
        
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int count = 1;
        int student_count = 0;
        int exam_count = 0;
        int grade_count = 0;
        
        String qr_student = "";
        String qr_exam = "";
        String qr_grade = "";
        
        String query = "select student_grade_exam_id, marks, student_name, grade_in_words, exam_name from student_grade_exam inner join grade_exam on student_grade_exam.grade_exam_id = grade_exam.g_e_id inner join grade on grade_exam.gd_id = grade.grade_id inner join exam on grade_exam.em_id = exam.exam_id inner join student on student_grade_exam.student_id = student.student_id where student_grade_exam_id > ?";
        
        if(!student.equals("")){
            qr_student = " and student_name like ?";
            count++;
            student_count = count;
        }
        if(!exam.equals("")){
            qr_exam = " and exam_name like ?";
            count++;
            exam_count = count;
        }
        if(!grade.equals("")){
            qr_grade = " and grade_in_words like ?";
            count++;
            grade_count = count;
        }
        
        query = query + qr_student + qr_exam + qr_grade;
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            if(!student.equals("")){
                prep.setString(student_count, "%" + student + "%");
            }
            if(!exam.equals("")){
                prep.setString(exam_count, exam);
            }
            if(!grade.equals("")){
                prep.setString(grade_count, grade);
            }
            
            result = prep.executeQuery();
            while(result.next()){
                String id = Integer.toString(result.getInt("student_grade_exam_id"));
                String stdnt = result.getString("student_name");
                String grd = result.getString("grade_in_words");
                String exm = result.getString("exam_name");
                String mks = result.getString("marks");
                
                HashMap<Integer, String> mp = new HashMap<Integer, String>();
                mp.put(0, id);
                mp.put(1, stdnt);
                mp.put(2, grd);
                mp.put(3, exm);
                mp.put(4, mks);
                
                hm.put(cnt, mp);
                cnt++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
    
    public HashMap get_student_grade_exam_records_by_id(int sge_id){
        PreparedStatement prep = null;
        ResultSet result = null;

        HashMap<Integer,String> mp = new HashMap<Integer,String>();
        
        String query = "select marks, remarks, description from student_grade_exam where student_grade_exam_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1,sge_id);
            result = prep.executeQuery();
            while(result.next()){
                String remarks = result.getString("remarks");
                String description = result.getString("description");
                String marks = result.getString("marks");
                                
                mp.put(0, marks);
                mp.put(1, remarks);
                mp.put(2, description);

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mp;        
    }
    
    public int update_sge_record(){
        int i = 0;
         PreparedStatement prep = null;
         
         String query = "update student_grade_exam set marks = ?, remarks = ?, description = ?, record_updated_by = ?, record_updated_at = ? where student_grade_exam_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getMarks());
            prep.setString(2, this.getRemarks());
            prep.setString(3, this.getDescription());
            prep.setInt(4, this.record_created_or_updated_by);
            prep.setTimestamp(5, Timestamp.valueOf(record_created_or_updated_at));
            prep.setInt(6, this.getStudent_grade_exam_id());
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public HashMap get_student_grade_exam_info(int student_id) throws SQLException{
        PreparedStatement prep = null;
        ResultSet result = null;
        
        HashMap<Integer, Map<String, String>> hm = new HashMap<Integer, Map<String, String>>();
        int count = 0;
        
        String query = "select grade.grade_in_words, exam.exam_name, exam.year, exam.semester, exam.details, grade_exam.session, grade_exam.date_and_time, student_grade_exam.marks, student_grade_exam.remarks, student_grade_exam.description from student_grade_exam inner join grade_exam on student_grade_exam.grade_exam_id = grade_exam.g_e_id inner join grade on grade_exam.gd_id = grade.grade_id inner join exam on grade_exam.em_id = exam.exam_id where student_grade_exam.student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            
            while(result.next()){
                HashMap<String, String> mp = new HashMap<String, String>();
                mp.put("Grade:", result.getString("grade.grade_in_words"));
                mp.put("Exam name:", result.getString("exam.exam_name"));
                mp.put("Year:", result.getString("exam.year"));
                mp.put("Semester:", result.getString("exam.semester"));
                mp.put("Exam details:", result.getString("exam.details"));
                mp.put("Session:", Integer.toString(result.getInt("grade_exam.session")));
                mp.put("Date and time:", result.getString("grade_exam.date_and_time"));
                mp.put("Marks:", result.getString("student_grade_exam.marks"));
                mp.put("Remarks:", result.getString("student_grade_exam.remarks"));
                mp.put("Student's exam performance review:", result.getString("student_grade_exam.description"));
                
                hm.put(count, mp);
                count++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
            if(result != null){
                try{
                    result.close();
                }catch(SQLException e){}
                result=null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep.close();
            }
            con.close();        
        }
        return hm;
    }
    
}
