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
    
}
