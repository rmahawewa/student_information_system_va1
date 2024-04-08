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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class User {
    
    private int id;
    private String name;
    private String user_name;
    private String password;
    private LocalDateTime created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public User() {
    }
    
    public int userLogin(){
    
//        int logged_in_user_id = 1;
//        return logged_in_user_id;

          PreparedStatement prep = null;
          ResultSet result = null;
          
          int user_id = -1;
          
          String query = "select iduser from user where user_name = ? and password = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getUser_name());
            prep.setString(2, this.getPassword());
            result = prep.executeQuery();
            while(result.next()){
                user_id = result.getInt("iduser");
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
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
                  Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        return user_id;    
    }
    
    public int add_user(){
        PreparedStatement prp = null;
        ResultSet result = null;
        PreparedStatement prep = null;        
        int i = 0;
        
        String qry = "select iduser from user where user_name = ? and password = ?";
        try {
            prp = con.prepareStatement(qry);
            prp.setString(1, this.getUser_name());
            prp.setString(2, this.getPassword());
            result = prp.executeQuery();
            
            while(result.next()){
                return -1;
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query = "insert into user (name, user_name, password, created_at) values (?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getName());
            prep.setString(2, this.getUser_name());
            prep.setString(3, this.getPassword());
            prep.setString(4, (this.created_or_updated_at).toString());
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
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
            if(prp != null){
                try{
                    prp.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
                prp = null;
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return i;
    }
    
    public int update_user(){
        PreparedStatement prp = null;
        ResultSet result = null;
        PreparedStatement prep = null;        
        int i = 0;
        
        String qry = "select iduser from user where user_name = ? and password = ?";
        try {
            prp = con.prepareStatement(qry);
            prp.setString(1, this.getUser_name());
            prp.setString(2, this.getPassword());
            result = prp.executeQuery();
            
            while(result.next()){
                return -1;
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query = "update user set name = ?, user_name = ?, password = ?, updated_at = ? where iduser = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getName());
            prep.setString(2, this.getUser_name());
            prep.setString(3, this.getPassword());
            prep.setString(4, (this.created_or_updated_at).toString());
            prep.setInt(5, this.getId());
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return i;
    }
    
    public List get_user_list(String text){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        List<String> l = new ArrayList<String>();
        
        String query = "select iduser, name from user where name like ? or user_name like ?";
        
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, "%" + text + "%");
            prep.setString(2, "%" + text + "%");
            result = prep.executeQuery();
            while(result.next()){
                String id = Integer.toString(result.getInt("iduser"));
                String name = result.getString("name");
                String entry = id + "-" + name;
                l.add(entry);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return l;        
    }
    
    public List get_user(int id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        List<String> l = new ArrayList<String>();
        
        String query = "select name, user_name, password from user where iduser = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, id);
            result = prep.executeQuery();
            while(result.next()){
                l.add(0, result.getString("name"));
                l.add(1, result.getString("user_name"));
                l.add(2, result.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return l;
    }
    
}
