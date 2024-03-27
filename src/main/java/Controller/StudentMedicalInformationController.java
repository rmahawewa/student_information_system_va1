/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentMedicalRequirements;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return 0;
    }
    
}
