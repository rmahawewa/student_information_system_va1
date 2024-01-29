/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import Model.LoggedInUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Exam {
    
    private int exam_id;
    private String exam_code;
    private String exam_name;
    private String year;
    private String semester;
    private String from_date;
    private String to_date;
    private String details;
    private int created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();

    public Exam() {
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getExam_code() {
        return exam_code;
    }

    public void setExam_code(String exam_code) {
        this.exam_code = exam_code;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
           
    
    public int addExam() throws SQLException{
        int ret_stts = 0;
        
        ConnectionString con_str = new ConnectionString();
        Connection con = con_str.getCon();
        
        PreparedStatement prep = null;
        
        String query = "insert into exam(exam_code,year,semester,from_date,to_date,exam_name,details,record_created_by,record_created_at) values (?,?,?,?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getExam_code()); 
            prep.setString(2, this.getYear());
            prep.setString(3,this.getSemester());
            prep.setDate(4, java.sql.Date.valueOf(this.getFrom_date()));
            prep.setDate(5, java.sql.Date.valueOf(this.getTo_date()));
//            prep.setDate(4, java.sql.Date.valueOf("2024-04-03"));
//            prep.setDate(5, java.sql.Date.valueOf("2024-04-08"));
            prep.setString(6,this.getExam_name());
            prep.setString(7, this.getDetails());
            prep.setInt(8, this.created_or_updated_by);
            prep.setTimestamp(9, Timestamp.valueOf(this.created_or_updated_at));
            
            int r = prep.executeUpdate();
            System.out.println("the r is:"+r);
        } catch (SQLException ex) {
            ret_stts = -1;
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep = null;
            }
            con.close();
        }
        
        return ret_stts;
    }
    
}
