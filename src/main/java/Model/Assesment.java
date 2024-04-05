/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import Model.LoggedInUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
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
public class Assesment {
    
    private int assesment_id;
    private String assesment_code;
    private String assesment_name;
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public Assesment() {
    }

    public int getAssesment_id() {
        return assesment_id;
    }

    public void setAssesment_id(int assesment_id) {
        this.assesment_id = assesment_id;
    }

    public String getAssesment_code() {
        return assesment_code;
    }

    public void setAssesment_code(String assesment_code) {
        this.assesment_code = assesment_code;
    }

    public String getAssesment_name() {
        return assesment_name;
    }

    public void setAssesment_name(String assesment_name) {
        this.assesment_name = assesment_name;
    }
    
    public List<String> get_assesments_by_text(String text) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        List<String> l = new ArrayList<String>();
        
        try{
            String query = "select assesment_id, assesment_name from assesment where assesment_name like ? or assesment_code like ?";
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + text + "%");
            ps.setString(2, "%" + text + "%");
            rs=ps.executeQuery();
            while(rs.next()){
                String id = Integer.toString(rs.getInt("assesment_id"));
                String name = rs.getString("assesment_name");
                String view_text = id+"-"+name;
                l.add(view_text);
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){}
                rs = null;
            }
            if(ps!=null){
                try{
                    ps.close();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
                ps=null;
            }
            con.close();
        }
        return l;
    }
    
    public int add_assesment() throws SQLException{
        int stts = -1;
        PreparedStatement prep = null;
        
        String asmt_code = this.getAssesment_code();
        String asmt_name = this.getAssesment_name();
        int created_by = this.record_created_or_updated_by;
        Timestamp created_at = Timestamp.valueOf(record_created_or_updated_at);
        
        String query = "insert into assesment (assesment_code, assesment_name, record_created_by, record_created_at) values (?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, asmt_code);
            prep.setString(2, asmt_name);
            prep.setInt(3, created_by);
            prep.setTimestamp(4, created_at);
            stts = prep.executeUpdate();
            System.out.println("new assesment insert status is: "+ stts);
        } catch (SQLException ex) {
            Logger.getLogger(Assesment.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
                prep = null;
            }
            con.close();
        }
        return stts;       
        
    }
    
    public HashMap get_all_assesments_for_detail(String asmt_name, String asmt_code){
//        System.out.println("asmt name: " + asmt_name);
//        System.out.println("asmt code: " + asmt_code);
        Map<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int cnt = 0;
        int count=1;
        int count1=0;
        int count2=0;
        String q1 = "";
        String q2 = "";
        String query = "select assesment_id, assesment_name, assesment_code from assesment where assesment_id > ? ";        
        if(!asmt_name.equals("")){
            q1 = "and assesment_name = ? ";
            count++;
            count1 = count;
        }
        if(!asmt_code.equals("")){
            q2 = "and assesment_code = ?";
            count++;
            count2 = count;
        }
        
        query = query + q1 + q2;
        //System.out.println(query);
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            if(!asmt_name.equals("")){
                prep.setString(count1, asmt_name);
            }
            if(!asmt_code.equals("")){
                prep.setString(count2, asmt_code);
            }
            
            result = prep.executeQuery();
            while(result.next()){
                Map<Integer,String> mp = new HashMap<Integer,String>();
                int assesment_id = result.getInt("assesment_id");
                String assesment_name = result.getString("assesment_name");
                String assesment_code = result.getString("assesment_code");
                mp.put(0,Integer.toString(assesment_id));
                mp.put(1, assesment_name);
                mp.put(2, assesment_code);
                hm.put(cnt, mp);
                cnt++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Assesment.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Assesment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (HashMap) hm;
    }
    
    public boolean update_assesment(){
        boolean b = true;
        PreparedStatement prep = null;
        
        String query = "update assesment set assesment_name = ?, assesment_code = ?, record_created_by = ?, record_created_at = ? where assesment_id = ?";
        
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getAssesment_name());
            prep.setString(2, this.getAssesment_code());
            prep.setInt(3, record_created_or_updated_by);
            prep.setTimestamp(4, Timestamp.valueOf(record_created_or_updated_at));
            prep.setInt(5, this.getAssesment_id());
            
            b = (prep.executeUpdate() > -1);
        } catch (SQLException ex) {
            Logger.getLogger(Assesment.class.getName()).log(Level.SEVERE, null, ex);
            b = false;
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
                Logger.getLogger(Assesment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return b;
    }
    
}
