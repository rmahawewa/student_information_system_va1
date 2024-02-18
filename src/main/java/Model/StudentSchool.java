/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import java.time.LocalDateTime;
import Model.LoggedInUser;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentSchool {
    
    private int student_school_id;
    private int school_id;
    private int student_id;
    private String date_of_entarance;
    private int is_currently_studing;
    private String date_of_leave;
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();
    
    public HashMap get_student_school_information(int student_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int cnt = 0;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer,Map<Integer,String>>();
                
        String query = "select student_school_id, school.school_name, date_of_entarance, is_currently_studing, String date_of_leave from student_school inner join school on student_school.school_id = school.school_id where student_school.student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            while(result.next()){
                String school_name = result.getString("school.school_name");
                String date_of_entarance = new Date(result.getDate("date_of_entarance").getTime()).toString();
                String is_currently_studing = Integer.toString(result.getInt("is_currently_studing"));
                String date_of_leave = new Date(result.getDate("is_currently_studing").getTime()).toString();
                String student_school_id = Integer.toString(result.getInt("student_school_id"));
                
                HashMap<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, school_name);
                mp.put(1, date_of_entarance);
                mp.put(2, is_currently_studing);
                mp.put(3, date_of_leave);
                mp.put(4, student_school_id);
                
                hm.put(cnt, mp);
                cnt++;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentSchool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
    
}
