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
public class School {
    
    private int school_id;
    private String school_name;
    private String school_address;
    private String school_contact_number;
    private String school_details;
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public School() {
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getSchool_address() {
        return school_address;
    }

    public void setSchool_address(String school_address) {
        this.school_address = school_address;
    }

    public String getSchool_contact_number() {
        return school_contact_number;
    }

    public void setSchool_contact_number(String school_contact_number) {
        this.school_contact_number = school_contact_number;
    }

    public String getSchool_details() {
        return school_details;
    }

    public void setSchool_details(String school_details) {
        this.school_details = school_details;
    }    
     
    public int add_school_record(){
        PreparedStatement prep = null;
        int i = 0;
        
        String query = "insert into school (school_name, school_address, school_contact_number, details, record_created_by, record_created_at) values(?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getSchool_name());
            prep.setString(2, this.getSchool_address());
            prep.setString(3, this.getSchool_contact_number());
            prep.setString(4, this.getSchool_details());
            prep.setInt(5, this.record_created_or_updated_by);
            prep.setTimestamp(6, Timestamp.valueOf(record_created_or_updated_at));
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(School.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public HashMap get_school_infomation(String school){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        HashMap<Integer, Map<Integer, String>> hm = new HashMap<Integer, Map<Integer,String>>();
        int count=0;
        
        String qry_school = "";
        
        String query = "select school_id, school_name, school_address, school_contact_number from school where school_id > ?";
        
        if(!school.equals("")){
            qry_school = " and school_name like ?";
        }
        
        query = query + qry_school;
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            
            if(!school.equals("")){
                prep.setString(2, "%" +school + "%");
            }
            
            result = prep.executeQuery();
            while(result.next()){
                String id = Integer.toString(result.getInt("school_id"));
                String school_name = result.getString("school_name");
                String school_address = result.getString("school_address");
                String contact_number = result.getString("school_contact_number");
                
                HashMap<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, id);
                mp.put(1, school_name);
                mp.put(2, school_address);
                mp.put(3, contact_number);
                hm.put(count, mp);
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(School.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
    
    public String get_individual_school_info_by_id(int school_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        String school_details = "";
        
        String query = "select details from school where school_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, school_id);
            result = prep.executeQuery();
            while(result.next()){
                school_details = result.getString("details");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(School.class.getName()).log(Level.SEVERE, null, ex);
        }
        return school_details;
    }
    
    public int update_school_info(){
        PreparedStatement prep = null;
        
        int value = 0;
        
        String query = "update school set school_name = ?, school_address = ?, school_contact_number = ?, details = ?, record_updated_by = ?, record_updated_at = ? where school_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(0, this.getSchool_name());
            prep.setString(1, this.getSchool_address());
            prep.setString(2, this.getSchool_contact_number());
            prep.setString(3, this.getSchool_details());
            prep.setInt(4, this.record_created_or_updated_by);
            prep.setTimestamp(5, Timestamp.valueOf(this.record_created_or_updated_at));
            prep.setInt(6, this.getSchool_id());
            value = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(School.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;        
    }
    
}
