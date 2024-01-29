package DatabaseConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ConnectionString {
    
    Connection con = null;
    
    private void LoadDriver(){
        try {
            Object new_instance = Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionString.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (InstantiationException ex) {
            Logger.getLogger(ConnectionString.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConnectionString.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    public ConnectionString(){
        LoadDriver();
        String username="root";
        String password="12345";
        String url = "jdbc:mysql://localhost/studentis?useUnicode=true&characterEncoding=UTF-8";
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionString.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
    public Connection getCon(){
        return con;
    }
    
}
