/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Exam;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author HP
 */
public class ExamController {
    
    public int createExam(List<String> exms) throws SQLException{
        Exam e = new Exam();
        e.setExam_name(exms.get(0));
        e.setExam_code(exms.get(1));        
        e.setYear(exms.get(2));
        e.setSemester(exms.get(3));
        e.setFrom_date(exms.get(4));
        e.setTo_date(exms.get(5));
        e.setDetails(exms.get(6));
        
        int r = e.addExam();
        
        return r;
    }
    
    public HashMap getExamDataByFiltering(String exam_name, String exam_code, String yr, String semester) throws SQLException{
        Exam e = new Exam();
        HashMap hm = e.getExamDataByInfo(exam_name, exam_code, yr, semester);
        return hm;
    }
    
}
