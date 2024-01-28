/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.LoggedInUser;

/**
 *
 * @author HP
 */
public class UserController {
    
    public int user_login(String usr_name, String pswd){
    
        User usr = new User();
        int logged_in_user_id = usr.userLogin();
        //LoggedInUser lnusr = new LoggedInUser(logged_in_user_id);
        LoggedInUser.setLogged_in_user(logged_in_user_id);
        System.out.println(LoggedInUser.getLogged_in_user());
        return 1;
        
    }    
    
}
