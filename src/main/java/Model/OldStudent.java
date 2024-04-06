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
public class OldStudent {
    
    private int old_student_id;
    private int student_id;
    private String left_date;
    private String reason_for_leaving;
    private String transferred_damma_school;
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public OldStudent() {
    }

    public int getOld_student_id() {
        return old_student_id;
    }

    public void setOld_student_id(int old_student_id) {
        this.old_student_id = old_student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getLeft_date() {
        return left_date;
    }

    public void setLeft_date(String left_date) {
        this.left_date = left_date;
    }

    public String getReason_for_leaving() {
        return reason_for_leaving;
    }

    public void setReason_for_leaving(String reason_for_leaving) {
        this.reason_for_leaving = reason_for_leaving;
    }

    public String getTransferred_damma_school() {
        return transferred_damma_school;
    }

    public void setTransferred_damma_school(String transferred_damma_school) {
        this.transferred_damma_school = transferred_damma_school;
    }
    
    
    public int insert_old_student_info(){
        PreparedStatement prep = null;
        int i =0;
        
        String query = "insert into old_student (student_id, left_date, reason_for_leaving, transferred_damma_school, record_created_by, record_created_at) values (?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, this.getStudent_id());
            prep.setString(2, this.getLeft_date());
            prep.setString(3, this.getReason_for_leaving());
            prep.setString(4, this.getTransferred_damma_school());
            prep.setInt(5, this.record_created_or_updated_by);
            prep.setTimestamp(6, Timestamp.valueOf(record_created_or_updated_at));
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
                prep = null;
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return i;
    }
    
    public HashMap get_old_student_list(String old_student_name){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        HashMap<Integer, Map<Integer, String>> hm = new HashMap<Integer, Map<Integer,String>>();
        int count=0;
        
        String qry_old_student = "";
        
        String query = "select old_student_id, left_date, student_name, student_contact_number from old_student inner join student on old_student.student_id = student.student_id where old_student_id > ?";
        
        if(!old_student_name.equals("")){
            qry_old_student = " and student_name like ?";
        }
        
        query = query + qry_old_student;
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            
            if(!old_student_name.equals("")){
                prep.setString(2, "%" + old_student_name + "%");
            }
            
            result = prep.executeQuery();
            while(result.next()){
                String id = Integer.toString(result.getInt("old_student_id"));
                String old_stdnt_name = result.getString("student_name");
                String left_date = result.getString("left_date");
                String contact_number = result.getString("student_contact_number");
                
                HashMap<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, id);
                mp.put(1, old_stdnt_name);
                mp.put(2, left_date);
                mp.put(3, contact_number);
                hm.put(count, mp);
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(School.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }            
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hm;
    }
    
    public List get_old_student_by_id(int old_student_id){
        
        PreparedStatement prep = null;
        ResultSet result = null;
        
        List<String> l = new ArrayList<String>();
        
        String query = "select reason_for_leaving, transferred_damma_school from old_student where old_student_id = ?";
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, old_student_id);
            result = prep.executeQuery();
            while(result.next()){
                l.add(0, result.getString("reason_for_leaving"));
                l.add(1, result.getString("transferred_damma_school"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }            
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return l;        
    }
    
    public int update_old_student_info_by_id(){
        PreparedStatement prep = null;
        int i = 0;
         
        String query = "update old_student set left_date = ?, reason_for_leaving = ?, transferred_damma_school = ?, record_updated_by = ?, record_updated_at = ? where old_student_id = ?";  
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getLeft_date());
            prep.setString(2, this.getReason_for_leaving());
            prep.setString(3, this.getTransferred_damma_school());
            prep.setInt(4, this.record_created_or_updated_by);
            prep.setTimestamp(5, Timestamp.valueOf(record_created_or_updated_at));
            prep.setInt(6, this.getOld_student_id());
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return i;
    }
    
}
