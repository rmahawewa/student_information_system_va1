/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentGradeExam;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class StudentGradeExamController {
    
    StudentGradeExam sge = new StudentGradeExam();
    
    public HashMap get_Info_by_student_id(int student_id){
        HashMap<Integer, Map<Integer,String>> hm = sge.get_student_exam_records_by_student_id(student_id);
        return hm;
    }
    
}
