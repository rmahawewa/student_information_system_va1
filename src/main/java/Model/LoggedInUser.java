/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
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
public class LoggedInUser {
    
    private static int logged_in_user;
    private LocalDateTime date_time = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

//    public LoggedInUser(int usr) {
//        LoggedInUser.logged_in_user = usr;
//    }

    public static int getLogged_in_user() {
        return logged_in_user;
    }

    public static void setLogged_in_user(int logged_in_user) {
        LoggedInUser.logged_in_user = logged_in_user;
    }  
    
    public void save_logged_in_user_data(int user_id){
        PreparedStatement prep = null;
        
        String query = "insert into last_logged_user (last_logged_user_id, logged_date_time) values (?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, user_id);
            prep.setTimestamp(2, Timestamp.valueOf(date_time));
            int i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoggedInUser.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LoggedInUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
}
