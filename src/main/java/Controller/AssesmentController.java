/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Assesment;
import java.sql.SQLException;
import java.util.List;

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
    
}
