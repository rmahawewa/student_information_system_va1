/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.GradeExam;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class ExamGradeController {
    
    GradeExam ge = new GradeExam();
    
    public HashMap loadExamGradeInfo(int exam_id){        
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        hm = ge.getInfoForGivenId(exam_id);
        return hm;
    }
    
    public int addGradeExam(List<String> l) throws SQLException{
        int r = 0;
        String eid = l.get(0);
        int e = Integer.parseInt(eid);
        ge.setE_id(Integer.parseInt(l.get(0)));
        ge.setG_id(Integer.parseInt(l.get(1)));
        ge.setSession(Integer.parseInt(l.get(2)));
        ge.setDate_time(l.get(3));
        
        r = ge.addGradeExam();
        
        return r;
    }
    
}
