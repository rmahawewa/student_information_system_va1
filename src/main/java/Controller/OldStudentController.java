/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.OldStudent;
import Model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class OldStudentController {
    
    OldStudent os = new OldStudent();
    
    public int add_old_student(List l){
        
        String student_id = l.get(0).toString();
        String date_of_leave = l.get(1).toString();
        String reason = l.get(2).toString();
        String transferred_damma_school = l.get(3).toString();
        
        os.setStudent_id(Integer.parseInt(student_id));
        os.setLeft_date(date_of_leave);
        os.setReason_for_leaving(reason);
        os.setTransferred_damma_school(transferred_damma_school);
        
        int i = os.insert_old_student_info();
        
        Student stdnt = new Student();
        int y = stdnt.updade_as_old_student(Integer.parseInt(student_id));
        
        return i;        
    }
    
    public HashMap getInfoByFiltering(String old_student_name){
        HashMap<Integer, Map<Integer, String>> hm = os.get_old_student_list(old_student_name);
        return hm;
    }
    
    public List get_old_student_info_by_id(int old_student_id){
        List<String> l = new ArrayList<String>();
        l = os.get_old_student_by_id(old_student_id);
        return l;
    }
    
    public int update_old_student_info(List l){
        os.setOld_student_id(Integer.parseInt(l.get(0).toString()));
        os.setLeft_date(l.get(1).toString());
        os.setReason_for_leaving(l.get(2).toString());
        os.setTransferred_damma_school(l.get(3).toString());
        int i = os.update_old_student_info_by_id();
        return i;
    }
    
}
