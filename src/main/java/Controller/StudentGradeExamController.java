/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentGradeExam;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class StudentGradeExamController {
    
    StudentGradeExam sge = new StudentGradeExam();
    
    public HashMap get_Info_by_student_id(int student_id) throws SQLException{
        HashMap<Integer, Map<Integer,String>> hm = sge.get_student_exam_records_by_student_id(student_id);
        return hm;
    }
    
    public int add_students_to_exam_grade(int exam_grade_id, int grade_id, String year){
        int r = sge.add_students_to_grade_exam(exam_grade_id, grade_id, year);
        return r;
    }
    
    public HashMap filtered_Student_grade_exam_list(String student, String exam, String grade){
        HashMap<Integer, Map<Integer, String>> hm = sge.get_record_list_by_filtering(student, exam, grade);
        return hm;
    }
    
    public HashMap get_info_by_id(int id){
        HashMap<Integer,String> hm = sge.get_student_grade_exam_records_by_id(id);
        return hm;
    }
    
    public int update_record(int sge_id, String marks, String remarks, String description){
        sge.setStudent_grade_exam_id(sge_id);
        sge.setMarks(marks);
        sge.setRemarks(remarks);
        sge.setDescription(description);
        
        int i = sge.update_sge_record();
        return i;
    }
    
    public HashMap get_student_grade_exam_info(int student_id) throws SQLException{
    
        HashMap<Integer, Map<String, String>> hm = new HashMap<Integer, Map<String, String>>();
        hm = sge.get_student_grade_exam_info(student_id);
        return hm;
        
    }
    
}
