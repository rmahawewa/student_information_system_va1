/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Grade;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class GradeController {
    
    Grade g = new Grade();
    
    public int addUser(List<String> list) throws SQLException{
        g.setGrade_in_number(list.get(0));
        g.setGrade_in_words(list.get(1));
        
        int rslt = g.add_grade();
        return rslt;
    }
    
    public HashMap getAllGrades() throws SQLException{
        Map<Integer,Map<Integer,String>> hm = g.getAllGrades();
        return (HashMap) hm;
    }
    
    public int getGradeId(String grade) throws SQLException{        
        int gid = g.getGradeId(grade);
        return gid;
    }
    
}
