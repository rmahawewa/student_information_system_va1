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
    
    public HashMap get_exam_assesment_records(String exam_name, String assesment_name, String date, String time, String level){

        PreparedStatement prep = null;
        ResultSet rs = null;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        int cnt = 0;
        
        int count = 1;
        int count_exam_name = 0;
        int count_assesment_name = 0;
        int count_date = 0;
        int count_time = 0;
        int count_level = 0;
        
        String q_exam_name = "";
        String q_assesment_name = "";
        String q_date = "";
        String q_time = "";
        String q_level = "";
        
        String query = "select e_a_id, date_and_time, level, exam_name, assesment_name from exam_assesment inner join exam on exam_assesment.exam_id = exam.exam_id inner join assesment on exam_assesment.assesment_id = assesment.assesment_id where e_a_id > ?";
        
        if(!exam_name.equals("")){
            q_exam_name = " and exam_name = ?";
            count++;
            count_exam_name = count;
        }
        if(!assesment_name.equals("")){
            q_assesment_name = " and assesment_name = ?";
            count++;
            count_assesment_name = count;
        }
        if(!date.equals("")){
            q_date = " and date_and_time like ?";
            count++;
            count_date = count;
        }
        if(!time.equals("")){
            q_time = " and date_and_time like ?";
            count++;
            count_time = count;
        }
        if(!level.equals("")){
            q_level = " and level = ?";
            count++;
            count_level = count;
        }
        
        query = query + q_exam_name + q_assesment_name + q_date + q_time + q_level;
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            if(!exam_name.equals("")){
                prep.setString(count_exam_name, exam_name);
            }
            if(!assesment_name.equals("")){
                prep.setString(count_assesment_name, assesment_name);
            }
            if(!date.equals("")){
                prep.setString(count_date, "%" + date + "%");
            }
            if(!time.equals("")){
                prep.setString(count_time, "%" + time + "%");
            }
            if(!level.equals("")){
                prep.setString(count_level, level);
            }
            rs = prep.executeQuery();
            while(rs.next()){
                int id = rs.getInt("e_a_id");
                String date_time = rs.getString("date_and_time");
                String levl = rs.getString("level");
                String exm_name = rs.getString("exam_name");
                String asmt_name = rs.getString("assesment_name");
                
                Map<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, Integer.toString(id));
                mp.put(1, exm_name);
                mp.put(2, asmt_name);
                mp.put(3, levl);
                mp.put(4, date_time);               
                
                hm.put(cnt, mp);
                cnt++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        System.out.println("Exam assesment hashmap: " + hm);
        return hm;
    }
    
    public HashMap load_info_by_examassesmentid(int eaid){
        HashMap<Integer, String> mp = new HashMap<Integer, String>();
        PreparedStatement prep = null;
        ResultSet result = null;
        
        String query = "select e_a_id, exam_assesment.level, exam_assesment.date_and_time, e_a_session, exam.exam_name, assesment.assesment_name, grade.grade_in_words from exam_assesment inner join exam on exam_assesment.exam_id = exam.exam_id inner join assesment on exam_assesment.assesment_id = assesment.assesment_id inner join grade on exam_assesment.grade_id = grade.grade_id where e_a_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, eaid);
            result = prep.executeQuery();
            
            while(result.next()){
                mp.put(0, Integer.toString(result.getInt("e_a_id")));
                mp.put(1, result.getString("exam.exam_name"));
                mp.put(2, result.getString("assesment.assesment_name"));
                mp.put(3, result.getString("grade.grade_in_words"));
                mp.put(4, result.getString("exam_assesment.level"));
                mp.put(5, result.getString("e_a_session"));
                String[] dt = result.getString("exam_assesment.date_and_time").split(" ");
                mp.put(6, dt[0]);
                mp.put(7, dt[1]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mp;
    }
    
}
