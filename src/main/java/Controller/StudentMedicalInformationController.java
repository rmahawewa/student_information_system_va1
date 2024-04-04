/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentMedicalRequirements;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentMedicalInformationController {
    
    StudentMedicalRequirements smr = new StudentMedicalRequirements();
    
    public HashMap get_student_medical_requirement_info(int student_id){
        HashMap<Integer, Map<Integer,String>> hm = smr.get_student_medical_requirement_info(student_id);
        return hm;
    }
    
    public int insert_student_medical_requirement_record(List l){
        
        smr.setStudent_id(Integer.parseInt(l.get(0).toString()));
        smr.setMedical_requirement_id(Integer.parseInt(l.get(1).toString()));
        smr.setFirst_date_of_diagnose(l.get(2).toString());
        smr.setFirst_date_of_getting_treatment(l.get(3).toString());
        smr.setLast_date_of_getting_treatment(l.get(4).toString());
        smr.setDetails(l.get(5).toString());
        int i = smr.add_student_medical_requirements_record();
        return i;
    }
    
    public HashMap get_data_list(String std_name, String medical_stts){
        HashMap<Integer, Map<Integer, String>> hm = new HashMap<Integer, Map<Integer, String>>();
        try {
            hm = smr.get_student_medical_info(std_name, medical_stts);
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalInformationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
    
    public String get_std_details_by_id(int id) throws SQLException{
        String details = smr.get_student_medical_info_by_id(id);
        return details;
    }
    
    public int update_info_by_id(List l){
        int i = 0;
        
        smr.setStudent_medical_requirement_id(Integer.parseInt(l.get(0).toString()));
        smr.setFirst_date_of_diagnose(l.get(1).toString());
        smr.setFirst_date_of_getting_treatment(l.get(2).toString());
        smr.setLast_date_of_getting_treatment(l.get(3).toString());
        smr.setDetails(l.get(4).toString());
        i = smr.update_student_medical_requirement_info();
        return i;
    }
    
    public HashMap get_student_medical_requirement_data(int student_id) throws SQLException{
        HashMap<Integer, Map<String, String>> hm = new HashMap<Integer, Map<String, String>>();
        hm = smr.select_student_medical_requirement_data(student_id);
        return hm;
    }
    
}
