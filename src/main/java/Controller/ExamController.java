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
    
    public HashMap getExamInfoById(int id){
        Exam e = new Exam();
        HashMap hm = e.getGivenExamInfo(id);
        return hm;
    }
    
    public int updateExamInfo(List<String> exam) throws SQLException{
        int retn_stts = 1;
        
        Exam e = new Exam();
        e.setExam_id(Integer.parseInt(exam.get(0)));
        e.setExam_name(exam.get(1));
        e.setExam_code(exam.get(2));
        e.setYear(exam.get(3));
        e.setSemester(exam.get(4));
        e.setFrom_date(exam.get(5));
        e.setTo_date(exam.get(6));
        e.setDetails(exam.get(7));
        
        retn_stts = e.updateExam();
        
        return retn_stts;
    }
    
}
