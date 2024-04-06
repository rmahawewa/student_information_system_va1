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
public class MedicalRequirements {
    private int id;
    private String desease_name;
    private int created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public MedicalRequirements() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesease_name() {
        return desease_name;
    }

    public void setDesease_name(String desease_name) {
        this.desease_name = desease_name;
    }
    
    public int insert_medical_requirement(){
        PreparedStatement prep = null;
        int i=0;
        
        String query = "insert into medical_requirements (desease_name, record_created_by, record_created_at) values (?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getDesease_name());
            prep.setInt(2, created_or_updated_by);
            prep.setTimestamp(3, Timestamp.valueOf(created_or_updated_at));
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(MedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return i;
    }
    
    public HashMap get_all_medical_requirement_details(){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        int cnt = 0;
        
        String query = "select medical_requirement_id, desease_name from medical_requirements where medical_requirement_id > ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            result = prep.executeQuery();
            while(result.next()){
                String id = Integer.toString(result.getInt("medical_requirement_id"));
                String desease_name = result.getString("desease_name");
                
                HashMap<Integer, String> mp = new HashMap<Integer, String>();
                mp.put(0, id);
                mp.put(1, desease_name);
                hm.put(cnt, mp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(MedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hm;
    }
    
    public List<String> get_info_by_text(String text){
        PreparedStatement prep = null;
        ResultSet result = null;
        List<String> lst = new ArrayList<String>();
        
        String query = "select medical_requirement_id, desease_name from medical_requirements where desease_name like ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1,"%"+text+"%");
            result = prep.executeQuery();
            int count = 0;
            while(result.next()){
                String id = Integer.toString(result.getInt("medical_requirement_id"));
                String name = result.getString("desease_name");
                String row = id+"-"+name;
                lst.add(count, row);
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
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
        }
        return lst;
    }
}
