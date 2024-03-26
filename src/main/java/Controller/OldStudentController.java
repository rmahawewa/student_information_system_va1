/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.OldStudent;
import java.util.List;

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
        
        int i = os.insert_old_student_info();
        
        return i;        
    }
    
}
