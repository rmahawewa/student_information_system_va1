/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.LoggedInUser;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class Student {
    
    private int stid;
    private String student_name = "";
    private String student_address = "";
    private String grade_in_year_of_entarance = "";
    //private LocalDateTime record_created_at; // = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    //private LocalDateTime record_updated_at; // = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private String student_birthday="";
    private String student_identity_code="";
    private String student_passport_number="";
    private String student_photo_file_path="";
    private String date_of_entarance="";
    private String year_of_entarance="";
    private String student_contact_number="";
    private int is_current_student;
    private LocalDateTime created_or_updated_at = LocalDateTime.now();

    public Student(int stid, int is_current_student) {
        this.stid = stid;
        this.is_current_student = is_current_student;
        LocalDateTime updated_at = this.created_or_updated_at;
        
    }        

    public Student() {
    }

    public String getYear_of_entarance() {
        return year_of_entarance;
    }

    public void setYear_of_entarance(String year_of_entarance) {
        this.year_of_entarance = year_of_entarance;
    }
    
    public String getStudent_contact_number() {
        return student_contact_number;
    }

    public void setStudent_contact_number(String student_contact_number) {
        this.student_contact_number = student_contact_number;
    }    

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public String getGrade_in_year_of_entarance() {
        return grade_in_year_of_entarance;
    }

    public void setGrade_in_year_of_entarance(String grade_in_year_of_entarance) {
        this.grade_in_year_of_entarance = grade_in_year_of_entarance;
    }
    
    public String getStudent_birthday() {
        return student_birthday;
    }

    public void setStudent_birthday(String student_birthday) {
        this.student_birthday = student_birthday;
    }

    public String getStudent_identity_code() {
        return student_identity_code;
    }

    public void setStudent_identity_code(String student_identity_code) {
        this.student_identity_code = student_identity_code;
    }

    public String getStudent_passport_number() {
        return student_passport_number;
    }

    public void setStudent_passport_number(String student_passport_number) {
        this.student_passport_number = student_passport_number;
    }

    public String getStudent_photo_file_path() {
        return student_photo_file_path;
    }

    public void setStudent_photo_file_path(String student_photo_file_path) {
        this.student_photo_file_path = student_photo_file_path;
    }

    public String getDate_of_entarance() {
        return date_of_entarance;
    }

    public void setDate_of_entarance(String date_of_entarance) {
        this.date_of_entarance = date_of_entarance;
    }
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();
    
    public int addStudent() throws SQLException{
        int returnstatus = 0;

        PreparedStatement prep = null;
        PreparedStatement prep_stmt = null;
        ResultSet result = null;     
        
        String query = "select student_id from student where student_ic = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getStudent_identity_code());
            result = prep.executeQuery();
            while(result.next()){
                returnstatus = 1;
            }
            if(returnstatus < 1){
                String q = "insert into student (grade_in_year_of_entarance, is_current_student, record_created_at, record_created_by, student_birthday, student_ic, student_passport_number, student_photo_file_path, date_of_entarance, student_name, student_address, student_contact_number, year_of_entarance) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                prep_stmt = con.prepareStatement(q);
                prep_stmt.setString(1, this.getGrade_in_year_of_entarance());
                prep_stmt.setInt(2, 1);
                prep_stmt.setTimestamp(3, Timestamp.valueOf(this.created_or_updated_at));
                prep_stmt.setInt(4, this.record_created_or_updated_by);
                prep_stmt.setString(5, this.getStudent_birthday());
                prep_stmt.setString(6, this.getStudent_identity_code());
                prep_stmt.setString(7, this.getStudent_passport_number());
                prep_stmt.setString(8, this.getStudent_photo_file_path());
                prep_stmt.setString(9, this.getDate_of_entarance());
                prep_stmt.setString(10, this.getStudent_name());
                prep_stmt.setString(11, this.getStudent_address());
                prep_stmt.setString(12, this.getStudent_contact_number());
                prep_stmt.setString(13, this.getYear_of_entarance());
                
                int count = prep_stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            returnstatus = -1;
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){}
                result = null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep=null;
            }
            if(prep_stmt != null){
                try{
                    prep_stmt.close();
                }catch(SQLException ex){}
                prep_stmt = null;
            }
            con.close();
        }
        return returnstatus;
    }
    
    public List<String> get_student_info_by_text(String text){
        PreparedStatement prep = null;
        ResultSet result = null;
        List<String> lst = new ArrayList<String>();
        
        String query = "select student_id, student_name from student where student_name like ? or student_ic like ? or student_passport_number like ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1,"%"+text+"%");
            prep.setString(2,"%"+text+"%");
            prep.setString(3,"%"+text+"%");
            result = prep.executeQuery();
            int count = 0;
            while(result.next()){
                String id = Integer.toString(result.getInt("student_id"));
                String name = result.getString("student_name");
                String row = id+"-"+name;
                lst.add(count, row);
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }
    
    public void getListOfStudentRecords(String std_name, String std_code, int medical_status, int grade, int school){
    
        PreparedStatement prep = null;
        ResultSet rs = null;
        
        //String query = "select student.student_id, student.student_name, student.student_birthday, student., grade.grade_in_words from student inner join grade on student.";
        String query = "select TIMESTAMPDIFF(YEAR, student.year_of_entarance, CURDATE()) as year_count, (grade_in_year_of_entarance + TIMESTAMPDIFF(YEAR, student.year_of_entarance, CURDATE())) as current_grade from student";
        try {
            prep = con.prepareStatement(query);
            rs = prep.executeQuery();
            while(rs.next()){
                String year_count = rs.getString("year_count");
                String current_grade = rs.getString("current_grade");
                System.out.println("year count is: " + year_count);
                System.out.println("current_grade is: " + current_grade);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
