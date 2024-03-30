/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentSchool;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
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
    
    public int add_student_school_record(List l){
        ss.setDate_of_entarance(l.get(1).toString());
        int current_student = Integer.parseInt(l.get(2).toString());
        ss.setIs_currently_studing(current_student);
        if(current_student == 0){
            ss.setDate_of_leave(l.get(3).toString());
        }        
        ss.setSchool_id(Integer.parseInt(l.get(0).toString()));
        ss.setStudent_id(Integer.parseInt(l.get(4).toString()));
        
        int i = ss.save_student_school_info();
        return i;
    }
    
    public List get_student_school_information(int student_school_id){
        List<String> l = ss.get_student_school_info(student_school_id);
        return l;
    }
    
}
