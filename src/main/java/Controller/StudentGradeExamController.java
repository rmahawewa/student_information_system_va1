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
    
    public int add_students_to_exam_grade(int exam_grade_id, int grade_id){
        int r = sge.add_students_to_grade_exam(exam_grade_id, grade_id);
        return r;
    }
    
}
