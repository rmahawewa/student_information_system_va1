/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MedicalRequirements;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class MedicalRequirementController {
    
    MedicalRequirements medrq = new MedicalRequirements();
    
    public int insert_med_req_data(String desease_name){
        
        medrq.setDesease_name(desease_name);
        int i = medrq.insert_medical_requirement();
        
        return i;
    }
    
    public HashMap get_data_list(){
        HashMap<Integer, Map<Integer, String>> hm = medrq.get_all_medical_requirement_details();
        return hm;
    }
    
}
