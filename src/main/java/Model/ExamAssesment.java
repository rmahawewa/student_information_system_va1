/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import java.sql.Connection;
import java.time.LocalDateTime;
import Model.LoggedInUser;
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
public class ExamAssesment {
    
    private int e_a_id;
    private int exam_id;
    private int assesmnt_id;
    private int session;
    private String date_time;
    private int grade_id;
    private String level;
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();
    
    private ConnectionString con_str = new ConnectionString();
    private Connection con = con_str.getCon();

    public ExamAssesment() {
        
    }

    public int getE_a_id() {
        return e_a_id;
    }

    public void setE_a_id(int e_a_id) {
        this.e_a_id = e_a_id;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public int getAssesmnt_id() {
        return assesmnt_id;
    }

    public void setAssesmnt_id(int assesmnt_id) {
        this.assesmnt_id = assesmnt_id;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
        
    public HashMap load_exam_assesment_info_for_id(int exam_id){
        ResultSet result = null;
        PreparedStatement prep = null;
        
        HashMap<Integer, Map<Integer,String>> mp = new HashMap<Integer, Map<Integer,String>>();
        
        String query = "select level, e_a_session, grade_in_words, assesment_name from exam_assesment inner join grade on exam_assesment.grade_id = grade.grade_id inner join assesment on exam_assesment.assesment_id = assesment.assesment_id where exam_assesment.exam_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, exam_id);
            result = prep.executeQuery();
            int count = 0;
            while(result.next()){
                String assesment_name = result.getString("assesment_name");
                String grade = result.getString("grade_in_words");
                String level = result.getString("level");
                String session = result.getString("e_a_session");
                
                Map<Integer,String> m = new HashMap<Integer,String>();
                m.put(0, assesment_name);
                m.put(1, grade);
                m.put(2, level);
                m.put(3, session);
                mp.put(count, m);
                count++;                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("mp");
        return mp;
    }
    
    public int add_single_record(){
        int stts = 0;
        PreparedStatement prep = null;
        
        String query = "insert into exam_assesment (exam_id,assesment_id,e_a_session,date_and_time,grade_id,level,record_created_by,record_created_at) values (?,?,?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, this.exam_id);
            prep.setInt(2, this.assesmnt_id);
            prep.setInt(3, this.session);
            prep.setString(4, this.date_time);
            prep.setInt(5, this.grade_id);
            prep.setString(6, this.level);
            prep.setInt(7, this.record_created_or_updated_by);
            prep.setTimestamp(8, Timestamp.valueOf(this.created_or_updated_at));
            stts = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
            stts = -1;
        }
        return stts;
    }
    
}
