/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Assesment;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class AssesmentController {
    
    Assesment asmt = new Assesment();
    
    public List getAssesmentByText(String text) throws SQLException{
        List<String> lst = asmt.get_assesments_by_text(text);
        return lst;
    }
    
    public int addAssesment(List<String> lst){
        int stts;
        String asmt_name = lst.get(0);
        String asmt_code = lst.get(1);
        
        asmt.setAssesment_name(asmt_name);
        asmt.setAssesment_code(asmt_code);
        
        stts = asmt.add_assesment();
        
        return stts;
    }
    
    public HashMap getAssesmentsByDetails(String asmt_name, String asmt_code){
//        System.out.println("asmt name: " + asmt_name);
//        System.out.println("asmt code: " + asmt_code);
        
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        hm = asmt.get_all_assesments_for_detail(asmt_name, asmt_code);
        return hm;
        
    }
    
    public boolean updateAssesment(List<String> lst){
        int id = Integer.parseInt(lst.get(0));
        String name = lst.get(1);
        String code = lst.get(2);
        
        asmt.setAssesment_id(id);
        asmt.setAssesment_name(name);
        asmt.setAssesment_code(code);
        boolean b = asmt.update_assesment();
        return b;
    }
    
}
