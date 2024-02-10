/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Student;
import java.util.ArrayList;
import java.util.List;

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
    
}
