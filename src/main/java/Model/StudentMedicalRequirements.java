/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import java.time.LocalDateTime;
import Model.LoggedInUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentMedicalRequirements {
    
    private int student_medical_requirement_id;
    private int student_id;
    private int medical_requirement_id;
    private String first_date_of_diagnose;
    private String first_date_of_getting_treatment;
    private String last_date_of_getting_treatment;
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_string = new ConnectionString();
    Connection con = con_string.getCon();

    public StudentMedicalRequirements() {
    }

    public int getStudent_medical_requirement_id() {
        return student_medical_requirement_id;
    }

    public void setStudent_medical_requirement_id(int student_medical_requirement_id) {
        this.student_medical_requirement_id = student_medical_requirement_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getMedical_requirement_id() {
        return medical_requirement_id;
    }

    public void setMedical_requirement_id(int medical_requirement_id) {
        this.medical_requirement_id = medical_requirement_id;
    }

    public String getFirst_date_of_diagnose() {
        return first_date_of_diagnose;
    }

    public void setFirst_date_of_diagnose(String first_date_of_diagnose) {
        this.first_date_of_diagnose = first_date_of_diagnose;
    }

    public String getFirst_date_of_getting_treatment() {
        return first_date_of_getting_treatment;
    }

    public void setFirst_date_of_getting_treatment(String first_date_of_getting_treatment) {
        this.first_date_of_getting_treatment = first_date_of_getting_treatment;
    }

    public String getLast_date_of_getting_treatment() {
        return last_date_of_getting_treatment;
    }

    public void setLast_date_of_getting_treatment(String last_date_of_getting_treatment) {
        this.last_date_of_getting_treatment = last_date_of_getting_treatment;
    }
    
    public HashMap get_student_medical_requirement_info(int student_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int cnt = 0;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        
        String query = "select desease_name, first_date_of_diagnose, first_date_of_getting_treatment, last_date_of_getting_treatment, student_medical_requirement_id from student_medical_requirements inner join medical_requirements on student_medical_requirements.medical_requirement_id = medical_requirements.medical_requirement_id where student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            while(result.next()){
                String desease_name = result.getString("desease_name");
                String first_date_of_diagnose = result.getString("first_date_of_diagnose");
                String first_date_of_getting_treatment = result.getString("first_date_of_getting_treatment");
                String last_date_of_getting_treatment = result.getString("last_date_of_getting_treatment");
                String id = Integer.toString(result.getInt("student_medical_requirement_id"));
                
                HashMap<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, desease_name);
                mp.put(1, first_date_of_diagnose);
                mp.put(2, first_date_of_getting_treatment);
                mp.put(3, last_date_of_getting_treatment);
                mp.put(4, id);
                
                hm.put(cnt, mp);
                cnt++;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
    
}
