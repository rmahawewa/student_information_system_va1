/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sis;

import View.MainView;
import Controller.UserController;
import Model.LoggedInUser;

/**
 *
 * @author HP
 */
public class SIS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
//        MainView mv = new MainView();
//        mv.setVisible(true);
        UserController uc = new UserController();
        uc.user_login("test", "test");
//        System.out.println("---------------------------------------");
//        System.out.println(LoggedInUser.getLogged_in_user());

        
    }
}
