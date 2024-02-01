/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.LoggedInUser;
import java.time.LocalDateTime;
import DatabaseConnection.ConnectionString;
import java.sql.Connection;
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
public class Grade {
    
    private int id;
    private String grade_in_number;
    private String grade_in_words;
    private int created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();

    public Grade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade_in_number() {
        return grade_in_number;
    }

    public void setGrade_in_number(String grade_in_number) {
        this.grade_in_number = grade_in_number;
    }

    public String getGrade_in_words() {
        return grade_in_words;
    }

    public void setGrade_in_words(String grade_in_words) {
        this.grade_in_words = grade_in_words;
    }
    
    
    public int add_grade() throws SQLException{
        int returnst = 0;
        
        ConnectionString conStr = new ConnectionString();
            Connection con = conStr.getCon();
            
            PreparedStatement prep = null;
    
        try {            
            String query = "insert into grade (grade_in_number,grade_in_words,record_created_by,record_created_at) values(?,?,?,?)";
            prep = con.prepareStatement(query);
            prep.setString(1, this.getGrade_in_number());
            prep.setString(2, this.getGrade_in_words());
            prep.setInt(3, this.created_or_updated_by);
            prep.setTimestamp(4, Timestamp.valueOf(this.created_or_updated_at));
            prep.executeUpdate();
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
    
    public HashMap getAllGrades() throws SQLException{
            ConnectionString con_str = new ConnectionString();
            Connection con = con_str.getCon();
            
            ResultSet result = null;
            PreparedStatement prep = null;
            
            Map<Integer,Map<Integer,String>> data = new HashMap<Integer,Map<Integer,String>>();
            int count = 0;
            
        try {           
            String query = "select grade_id, grade_in_number, grade_in_words from grade where grade_id > ?";
            prep=con.prepareStatement(query);
            prep.setInt(1, 0);
            result = prep.executeQuery();
            while(result.next()){
                Map<Integer,String> dt = new HashMap<Integer,String>();
                //dt.put(0, result.getString("grade_id"));
                dt.put(0, result.getString("grade_in_number"));
                dt.put(1, result.getString("grade_in_words"));
                
                data.put(count, dt);
                count++;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException e){}
                result.close();
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep.close();
            }
            con.close();
        }
        System.out.println(data);
        return (HashMap) data;
    }
    
}
