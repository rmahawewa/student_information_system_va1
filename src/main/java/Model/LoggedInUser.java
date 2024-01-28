/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class LoggedInUser {
    
    private static int logged_in_user;

//    public LoggedInUser(int usr) {
//        LoggedInUser.logged_in_user = usr;
//    }

    public static int getLogged_in_user() {
        return logged_in_user;
    }

    public static void setLogged_in_user(int logged_in_user) {
        LoggedInUser.logged_in_user = logged_in_user;
    }  
    
    
}
