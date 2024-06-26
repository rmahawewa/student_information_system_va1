/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentAssesmentExam;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class StudentAssesmentExamController {
    StudentAssesmentExam sae = new StudentAssesmentExam();
    
    public int addStudentAssesmentExam(List<String> l){
        sae.setExam_asmt_id(Integer.parseInt(l.get(0)));
        sae.setStdnt_id(Integer.parseInt(l.get(1)));
        sae.setMarks(l.get(2));
        sae.setRemarks(l.get(3));
        sae.setDescription(l.get(4));
        int r = sae.add_student_assesment_exam_record();
        return r;
    }
    
    public HashMap get_student_assesment_exam_details(int student_id) throws SQLException{
        HashMap<Integer, Map<Integer,String>> hm = sae.get_student_assesment_exam_details_by_studentid(student_id);
        return hm;
    }
    
    public HashMap get_list_of_sae_details(String student_name, String exam, String assesment) throws SQLException{
        HashMap<Integer, Map<Integer,String>> hm = sae.get_student_exam_assesment_list(student_name, exam, assesment);
        return hm;
    }
    
    public HashMap get_info_by_id(int id) throws SQLException{
        HashMap<Integer,String> hm = sae.get_unique_record_by_id(id);
        return hm;
    }
    
    public int update_individual_entry(int id, String marks, String remarks, String description){
        sae.setStd_asmt_exam_id(id);
        sae.setMarks(marks);
        sae.setRemarks(remarks);
        sae.setDescription(description);
        int i = sae.update_student_assesment_exam();
        return i;
    }
    
    public HashMap get_student_exam_assesment_info(int student_id) throws SQLException{
    
        HashMap<Integer, Map<String, String>> hm = new HashMap<Integer, Map<String, String>>();
        hm = sae.get_student_assesment_exam_records(student_id);
        return hm;
    }
}
