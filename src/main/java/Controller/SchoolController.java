/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.School;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class SchoolController {
    
    School scl = new School();
    
    public int insert_school_record(List l){
        scl.setSchool_name(l.get(0).toString());
        scl.setSchool_address(l.get(1).toString());
        scl.setSchool_contact_number(l.get(2).toString());
        scl.setSchool_details(l.get(3).toString());
        
        int i = scl.add_school_record();
        
        return i;
    }
    
    public HashMap get_school_list(String school){
        HashMap<Integer, Map<Integer, String>> hm = scl.get_school_infomation(school);
        return hm;
    }
    
}
