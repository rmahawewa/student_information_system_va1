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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    
}
