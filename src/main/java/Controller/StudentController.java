/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Student;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentController {
    
    Student stnd = new Student();
    
    public List getStudentsByText(String text){
        List<String> lst = new ArrayList<String>();
        lst = stnd.get_student_info_by_text(text);
        return lst;
    }
    
    public boolean addStudentRecord(List<String> l){
        boolean b = false;
        
        String student_name = l.get(0);
        String address = l.get(1);
        String birthday = l.get(2);
        String contactNumber = l.get(3);
        String identityCode = l.get(4);
        String passportNumber = l.get(5);
        String dateOfEnterance = l.get(6);
        //System.out.println("date of entarance: " + dateOfEnterance);
        //return false;
        int grade_id = Integer.parseInt(l.get(7));
        String file_location = l.get(8);
        String year_of_entarance = l.get(9);
        
        stnd.setStudent_name(student_name);
        stnd.setStudent_address(address);
        stnd.setStudent_birthday(birthday);
        stnd.setStudent_contact_number(contactNumber);
        stnd.setStudent_identity_code(identityCode);
        stnd.setStudent_passport_number(passportNumber);
        stnd.setDate_of_entarance(dateOfEnterance);
        stnd.setGrade_in_year_of_entarance(Integer.toString(grade_id));
        stnd.setStudent_photo_file_path(file_location);
        stnd.setYear_of_entarance(year_of_entarance);
        
        try {
            b = stnd.addStudent() >= 0 ? true : false;
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
    }
    
    public HashMap ListStudents(String student_name, String student_code, String medical_status,int grade, String school){
        HashMap<Integer, Map<Integer,String>> hm = stnd.getListOfStudentRecords(student_name, student_code, medical_status, grade, school);
        return hm;
    }
    
    public List get_student_details_by_id(int student_id){
        List<String> l = stnd.get_student_details_by_id(student_id);
        return l;
    }
    
    public boolean updateStudentRecord(List<String> l){
        boolean b = false;
        
        int student_id = Integer.parseInt(l.get(10));
        String student_name = l.get(0);
        String address = l.get(1);
        String birthday = l.get(2);
        String contactNumber = l.get(3);
        String identityCode = l.get(4);
        String passportNumber = l.get(5);
        String dateOfEnterance = l.get(6);
        //System.out.println("date of entarance: " + dateOfEnterance);
        //return false;
        int grade_id = Integer.parseInt(l.get(7));
        String file_location = l.get(8);
        String year_of_entarance = l.get(9);
        
        stnd.setStid(student_id);
        stnd.setStudent_name(student_name);
        stnd.setStudent_address(address);
        stnd.setStudent_birthday(birthday);
        stnd.setStudent_contact_number(contactNumber);
        stnd.setStudent_identity_code(identityCode);
        stnd.setStudent_passport_number(passportNumber);
        stnd.setDate_of_entarance(dateOfEnterance);
        stnd.setGrade_in_year_of_entarance(Integer.toString(grade_id));
        stnd.setStudent_photo_file_path(file_location);
        stnd.setYear_of_entarance(year_of_entarance);
        
        try {
            b = stnd.update_student() >= 0 ? true : false;
        } catch (Exception ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
    }
    
    public HashMap get_student_info_by_id(int student_id){
        HashMap<String, String> hm = stnd.get_student_information_by_id(student_id);
        return hm;
    }
    
}
