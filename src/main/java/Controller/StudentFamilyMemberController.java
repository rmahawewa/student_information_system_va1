/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentFamilyMember;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class StudentFamilyMemberController {
    
    StudentFamilyMember sfm = new StudentFamilyMember();
    
    public HashMap getStudentFamilyMembersByStudentId(int student_id){
        HashMap<Integer, Map<Integer,String>> hm = sfm.get_student_family_member_details(student_id);
        return hm;
    }
    
    public int add_student_family_member_information(List l){
        sfm.setStudent_id(Integer.parseInt(l.get(0).toString()));
        sfm.setFamily_member_name(l.get(1).toString());
        sfm.setRelationship(l.get(2).toString());
        sfm.setBirthday(l.get(3).toString());
        sfm.setNic(l.get(4).toString());
        sfm.setCareer(l.get(5).toString());
        
        int i = sfm.add_student_family_member_information();
        return i;
    }
    
    public List get_family_member_info_by_id(int sfm_id){
        List<String> l = sfm.get_family_member_details_by_id(sfm_id);
        return l;
    }
    
}
