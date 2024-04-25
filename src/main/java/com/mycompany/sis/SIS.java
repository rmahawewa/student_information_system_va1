/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sis;

import View.MainView;
import Controller.UserController;
import Model.LoggedInUser;
import UserLibraries.GetTimes;
import View.UserLogin;

/**
 *
 * @author HP
 */
public class SIS {

    public static void main(String[] args) {
        //System.out.println("පරීක්ෂණය");
//        System.out.println("The current day is: " + GetTimes.getCurrentDay()); 
//        System.out.println("Hello World!");
        
//        MainView mv = new MainView();
//        mv.setVisible(true);
//        UserController uc = new UserController();
//        uc.user_login("test", "test");
//        System.out.println("---------------------------------------");
//        System.out.println(LoggedInUser.getLogged_in_user());
//        MainView mv = new MainView();
//        mv.setVisible(true);

          System.out.println("Hello, Have a nice day");
          
          UserLogin ul = new UserLogin();
          ul.setVisible(true);
        
    }
}
