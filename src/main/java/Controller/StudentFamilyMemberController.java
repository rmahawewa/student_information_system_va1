/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentFamilyMember;
import java.util.HashMap;
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
    
}
