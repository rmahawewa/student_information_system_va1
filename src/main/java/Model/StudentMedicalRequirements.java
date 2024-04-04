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
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
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
    private String details;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
    
    
    public int add_student_medical_requirements_record(){
        PreparedStatement prep = null;
        int i = 0;
        
        String query = "insert into student_medical_requirements (student_id, medical_requirement_id, first_date_of_diagnose, first_date_of_getting_treatment, last_date_of_getting_treatment, details, record_created_by, record_created_at) values (?,?,?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, this.getStudent_id());
            prep.setInt(2, this.getMedical_requirement_id());
            prep.setString(3, this.getFirst_date_of_diagnose());
            prep.setString(4, this.getFirst_date_of_getting_treatment());
            prep.setString(5, this.getLast_date_of_getting_treatment());
            prep.setString(6, this.getDetails());
            prep.setInt(7, this.record_created_or_updated_by);
            prep.setTimestamp(8, Timestamp.valueOf(this.record_created_or_updated_at));
            
            i = prep.executeUpdate();
            System.out.println("insertion: " + i);
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return i;        
    }
    
    public HashMap get_student_medical_info(String student, String medical_status) throws SQLException{
        PreparedStatement prep = null;
        ResultSet rs = null;
        
        Map<Integer, Map<Integer,String>> sm_list = new HashMap<Integer, Map<Integer,String>>();
        
        int count = 1;
        int count1 = 0;
        int count2 = 0;
        String studentNameQuery = "";
        String medicalStatusQuery = "";
                        
        try{
            String query = "select student_medical_requirement_id, student_name, desease_name, first_date_of_diagnose, first_date_of_getting_treatment, last_date_of_getting_treatment from student_medical_requirements join student on student_medical_requirements.student_id = student.student_id join medical_requirements on student_medical_requirements.medical_requirement_id = medical_requirements.medical_requirement_id where student_medical_requirements.medical_requirement_id > ?";
        
            if(!student.equals("")){
                studentNameQuery = " and student.student_name like ?";
                count++;
                count1 = count;
            }
            if(!medical_status.equals("")){
                medicalStatusQuery = " and medical_requirements.desease_name = ?";
                count++;
                count2 = count;
            }

            query = query + studentNameQuery + medicalStatusQuery;
            prep = con.prepareStatement(query);

            prep.setInt(1, 0);

            if(count1 > 1){
                prep.setString(count1, "%" +student + "%");
            }
            if(count2 > 1){
                prep.setString(count2, "%" + medical_status + "%");
            }

            rs = prep.executeQuery();

            int cnt=0;
            while(rs.next()){
                int student_medical_requirement_id = rs.getInt("student_medical_requirement_id");
                String student_name = rs.getString("student_name");
                String desease_name = rs.getString("desease_name");
                String first_date_of_diagnose = rs.getString("first_date_of_diagnose");
                String first_date_of_getting_treatment = rs.getString("first_date_of_getting_treatment");
                String last_date_of_getting_treatment = rs.getString("last_date_of_getting_treatment");

                Map<Integer,String> row = new HashMap<Integer,String>();
                row.put(0, student_name);
                row.put(1, desease_name);
                row.put(2, first_date_of_diagnose);
                row.put(3, first_date_of_getting_treatment);
                row.put(4, last_date_of_getting_treatment);
                row.put(5, Integer.toString(student_medical_requirement_id));

                sm_list.put(cnt, row);
                cnt++;
            }
        }catch(Exception ex){
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            if(rs != null){
                try{
                    rs.close();
                }catch(SQLException e){}
                rs=null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep.close();
            }
            con.close();        
        }    
        return (HashMap) sm_list;
    }
    
    public String get_student_medical_info_by_id(int id) throws SQLException{
        PreparedStatement prep = null;
        ResultSet result = null;
        
        String details = "";
        
        String query = "select details from student_medical_requirements where student_medical_requirement_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, id);
            result = prep.executeQuery();
            while(result.next()){
                details = result.getString("details");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException e){}
                result=null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep.close();
            }
            con.close();  
        }
        return details;
    }
    
    public int update_student_medical_requirement_info(){
        PreparedStatement prep = null;
        int i = 0;
        
        String query = "update student_medical_requirements set first_date_of_diagnose = ?, first_date_of_getting_treatment = ?, last_date_of_getting_treatment = ?, details = ?, record_updated_by = ?, record_updated_at = ? where student_medical_requirement_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getFirst_date_of_diagnose());
            prep.setString(2, this.getFirst_date_of_getting_treatment());
            prep.setString(3, this.getLast_date_of_getting_treatment());
            prep.setString(4, this.getDetails());
            prep.setInt(5, this.record_created_or_updated_by);
            prep.setTimestamp(6, Timestamp.valueOf(record_created_or_updated_at));
            prep.setInt(7, this.getStudent_medical_requirement_id());
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public HashMap select_student_medical_requirement_data(int student_id) throws SQLException{
        PreparedStatement prep = null;
        ResultSet result = null;
        
        HashMap<Integer, Map<String, String>> hm = new HashMap<Integer, Map<String, String>>();
        int count = 0;
        
        String query = "select desease_name, first_date_of_diagnose, first_date_of_getting_treatment, last_date_of_getting_treatment, details from student_medical_requirements inner join medical_requirements on student_medical_requirements.medical_requirement_id = medical_requirements.medical_requirement_id where student_medical_requirements.student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            while(result.next()){
                
                HashMap<String, String> mp = new HashMap<String, String>();
                mp.put("Desease:", result.getString("desease_name"));
                mp.put("First date of diagnose:", result.getString("first_date_of_diagnose"));
                mp.put("First treatment date:", result.getString("first_date_of_getting_treatment"));
                mp.put("Last treatment date:", result.getString("last_date_of_getting_treatment"));
                mp.put("Details:", result.getString("details"));
                
                hm.put(count, mp);
                count++;
            }            
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirements.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            if(result != null){
                try{
                    result.close();
                }catch(SQLException e){}
                result=null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep.close();
            }
            con.close();        
        }  
        return hm;
    }
    
}
