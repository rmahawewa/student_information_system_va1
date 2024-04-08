/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.LoggedInUser;
import java.util.List;

/**
 *
 * @author HP
 */
public class UserController {
    
    User u = new User();
    
    public int user_login(String usr_name, String pswd){
    
//        User usr = new User();
//        int logged_in_user_id = usr.userLogin();
//        //LoggedInUser lnusr = new LoggedInUser(logged_in_user_id);
//        LoggedInUser.setLogged_in_user(logged_in_user_id);
//        System.out.println(LoggedInUser.getLogged_in_user());
//        return 1;
        
        u.setUser_name(usr_name);
        u.setPassword(pswd);
        int user_id = u.userLogin();
        
        if(user_id > 0){
            LoggedInUser liu = new LoggedInUser();
            liu.setLogged_in_user(user_id);
            liu.save_logged_in_user_data(user_id);
        }
        return user_id;
        
    }    
    
    public int save_user(List l){
        u.setName(l.get(0).toString());
        u.setUser_name(l.get(1).toString());
        u.setPassword(l.get(2).toString());
        
        int i = u.add_user();
        
        return i;
    }
    
    public List user_list(String text){
        List<String> l = u.get_user_list(text);
        return l;
    }
    
    public List getUserById(int id){
        List<String> l = u.get_user(id);
        return l;
    }
    
    public int update_user(List l){
        u.setId(Integer.parseInt(l.get(0).toString()));
        u.setName(l.get(1).toString());
        u.setUser_name(l.get(2).toString());
        u.setPassword(l.get(3).toString());
        int i = u.update_user();
        return i;
    }
}
