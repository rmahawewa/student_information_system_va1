/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import java.time.LocalDateTime;
import Model.LoggedInUser;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentSchool {
    
    private int student_school_id;
    private int school_id;
    private int student_id;
    private String date_of_entarance;
    private int is_currently_studing;
    private String date_of_leave = "";
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public StudentSchool() {
    }

    public int getStudent_school_id() {
        return student_school_id;
    }

    public void setStudent_school_id(int student_school_id) {
        this.student_school_id = student_school_id;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getDate_of_entarance() {
        return date_of_entarance;
    }

    public void setDate_of_entarance(String date_of_entarance) {
        this.date_of_entarance = date_of_entarance;
    }

    public int getIs_currently_studing() {
        return is_currently_studing;
    }

    public void setIs_currently_studing(int is_currently_studing) {
        this.is_currently_studing = is_currently_studing;
    }

    public String getDate_of_leave() {
        return date_of_leave;
    }

    public void setDate_of_leave(String date_of_leave) {
        this.date_of_leave = date_of_leave;
    }
    
    
    
    public HashMap get_student_school_information(int student_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int cnt = 0;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer,Map<Integer,String>>();
                
        String query = "select student_school_id, school.school_name, date_of_entarance, is_currently_studing, date_of_leave from student_school inner join school on student_school.school_id = school.school_id where student_school.student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            while(result.next()){
                String school_name = result.getString("school.school_name");
                String date_of_entarance = result.getString("date_of_entarance");
                String is_currently_studing = Integer.toString(result.getInt("is_currently_studing"));
                String date_of_leave = result.getString("date_of_leave");
                String student_school_id = Integer.toString(result.getInt("student_school_id"));
                
                HashMap<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, school_name);
                mp.put(1, date_of_entarance);
                mp.put(2, is_currently_studing == "1"?"yes":"no");
                mp.put(3, date_of_leave);
                mp.put(4, student_school_id);
                
                hm.put(cnt, mp);
                cnt++;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentSchool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
    
    public int save_student_school_info(){
        int i = 0;
        
        PreparedStatement prep = null;
        
        String query = "insert into student_school(student_id, school_id, date_of_entarance, date_of_leave, is_currently_studing, record_created_by, record_created_at) values (?,?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, this.getStudent_id());
            prep.setInt(2, this.getSchool_id());
            prep.setString(3, this.getDate_of_entarance());
            prep.setString(4, this.getDate_of_leave());
            prep.setInt(5, this.getIs_currently_studing());
            prep.setInt(6, this.record_created_or_updated_by);
            prep.setTimestamp(7, Timestamp.valueOf(this.record_created_or_updated_at));
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentSchool.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
    }
    
    public List get_student_school_info(int student_school_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        List<String> l = new ArrayList<String>();
        
        String query = "select student_name, school_name, school_address, school_contact_number, details from student_school inner join school on student_school.school_id = school.school_id inner join student on student_school.student_id = student.student_id where student_school.student_school_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_school_id);
            result = prep.executeQuery();
            while(result.next()){
                l.add(0, result.getString("student_name"));
                l.add(1, result.getString("school_name"));
                l.add(2, result.getString("school_address"));
                l.add(3, result.getString("school_contact_number"));
                l.add(4, result.getString("details"));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentSchool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    
}
