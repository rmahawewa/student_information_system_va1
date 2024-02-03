/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.HashMap;
import Model.ExamAssesment;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class ExamAssesmentController {
    
    ExamAssesment ea = new ExamAssesment();
    
    public HashMap loadExamAssesmentInfoForId(int xam_id){
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        hm = ea.load_exam_assesment_info_for_id(xam_id);
        return hm;
    }
    
    public int addRecord(List<String> list){
        int stts = -1;
        ea.setExam_id(Integer.valueOf(list.get(0)));
        ea.setAssesmnt_id(Integer.valueOf(list.get(1)));
        ea.setSession(Integer.valueOf(list.get(2)));
        ea.setDate_time(list.get(3));
        ea.setGrade_id(Integer.valueOf(list.get(4)));
        ea.setLevel(list.get(5));
        stts = ea.add_single_record();
        //int stts = ea.
        
        return stts;
    }
    
}
