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
import java.sql.SQLException;
import java.sql.Timestamp;
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
        }
        return i;
    }
    
}
