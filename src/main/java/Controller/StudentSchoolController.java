/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentSchool;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class StudentSchoolController {
    
    StudentSchool ss = new StudentSchool();
    
    public HashMap getStudentSchoolDetailsForStudentId(int student_id){
        HashMap<Integer, Map<Integer,String>> hm = ss.get_student_school_information(student_id);
        return hm;
    }
    
}
