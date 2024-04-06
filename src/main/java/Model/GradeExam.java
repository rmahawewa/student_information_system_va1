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
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class GradeExam {
    
    private int g_e_id;
    private int e_id;
    private int g_id;
    private int session;
    private String date_time;
    private int created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();
    
    private ConnectionString con_str = new ConnectionString();
    private Connection con = con_str.getCon();

    public GradeExam() {
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }    
    
    public int getG_e_id() {
        return g_e_id;
    }

    public void setG_e_id(int g_e_id) {
        this.g_e_id = g_e_id;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
    
    public HashMap getInfoForGivenId(int id){        
        
        ResultSet result = null;
        PreparedStatement prep = null;
        
        HashMap<Integer, Map<Integer,String>> mp = new HashMap<Integer, Map<Integer,String>>();
        
        String query = "select session,date_and_time,grade_in_words from grade_exam inner join grade on grade_exam.gd_id = grade.grade_id where grade_exam.em_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, id);
            result = prep.executeQuery();
            int count = 0;
            while(result.next()){
                String grade = result.getString("grade_in_words");
                String session = result.getString("session");
                String date_time = result.getString("date_and_time");
                
                Map<Integer,String> m = new HashMap<Integer,String>();
                m.put(0, grade);
                m.put(1, session);
                m.put(2, date_time);
                mp.put(count, m);
                count++;                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GradeExam.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
                result = null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
                prep = null;
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(GradeExam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("mp");
        return mp;
    }
    
    public int addGradeExam() throws SQLException{
            int returnst = 0;

            PreparedStatement prep = null;
    
        try {            
            String query = "insert into grade_exam (em_id,gd_id,session,date_and_time,record_created_at,record_created_by) values(?,?,?,?,?,?)";
            prep = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            prep.setInt(1, this.getE_id());
            prep.setInt(2, this.getG_id());
            prep.setInt(3, this.getSession());
            prep.setString(4, this.getDate_time());
            prep.setTimestamp(5, Timestamp.valueOf(this.created_or_updated_at));
            prep.setInt(6, created_or_updated_by);
            prep.executeUpdate();
            ResultSet rs = prep.getGeneratedKeys();
            while(rs.next()){
                returnst = rs.getInt(1);
            }
        } catch (SQLException ex) {
            returnst = -1;
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep = null;
            }
            con.close();
        }
    
        return returnst;
    }
    
    public HashMap get_filtered_examgrade_records(String exam_name, String grade, String date, String time, String session){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        String q_exam_name = "";
        String q_grade = "";
        String q_date = "";
        String q_time = "";
        String q_session = "";
        
        int count = 1;
        int count_exam_name = 0;
        int count_grade = 0;
        int count_date = 0;
        int count_time = 0;
        int count_session = 0;
        
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        int cnt = 0;
        
        String query = "select g_e_id, session, date_and_time, exam_name, grade_in_words from grade_exam inner join exam on grade_exam.em_id = exam.exam_id inner join grade on grade_exam.gd_id = grade.grade_id where g_e_id > ?";
        
        if(!exam_name.equals("")){
            q_exam_name = " and exam_name like ?";
            count++;
            count_exam_name = count;
        }
        
        if(!grade.equals("")){
            q_grade = " and grade_in_words = ?";
            count++;
            count_grade = count;
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
        
        if(!session.equals("")){
            q_session = " and session = ?";
            count++;
            count_session = count;
        }
        
        query = query + q_exam_name + q_grade + q_date + q_time + q_session;
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            
            if(!exam_name.equals("")){
                prep.setString(count_exam_name, "%" + exam_name + "%");
            }

            if(!grade.equals("")){
                prep.setString(count_grade, grade);
            }

            if(!date.equals("")){
                prep.setString(count_date, "%" + date + "%");
            }

            if(!time.equals("")){
                prep.setString(count_time, "%" + time + "%");
            }

            if(!session.equals("")){
                prep.setString(count_session, session);
            }
            
            result = prep.executeQuery();
            
            while(result.next()){
                String id = Integer.toString(result.getInt("g_e_id"));
                String exam = result.getString("exam_name");
                String grd = result.getString("grade_in_words");
                String sn = result.getString("session");
                String date_time = result.getString("date_and_time");
                
                HashMap<Integer, String> mp = new HashMap<Integer, String>();
                mp.put(0, id);
                mp.put(1, exam);
                mp.put(2, grd);
                mp.put(3, sn);
                mp.put(4, date_time);
                
                hm.put(cnt, mp);
                cnt++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GradeExam.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
                result = null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
                prep = null;
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(GradeExam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hm;
    }
    
    public int update_grade_exam_record(){
        PreparedStatement prep = null;
        int d = -1;
        
        String query = "update grade_exam set session = ?, date_and_time = ? where g_e_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, this.session);
            prep.setString(2, this.date_time);
            prep.setInt(3, this.g_e_id);
            d = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GradeExam.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(GradeExam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return d;
    }
    
}
