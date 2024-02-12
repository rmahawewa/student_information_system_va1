/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentAssesmentExam;
import java.util.List;

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
}
