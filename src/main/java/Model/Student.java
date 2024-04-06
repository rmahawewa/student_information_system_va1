/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.LoggedInUser;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class Student {
    
    private int stid;
    private String student_name = "";
    private String student_address = "";
    private String grade_in_year_of_entarance = "";
    //private LocalDateTime record_created_at; // = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    //private LocalDateTime record_updated_at; // = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private String student_birthday="";
    private String student_identity_code="";
    private String student_passport_number="";
    private String student_photo_file_path="";
    private String date_of_entarance="";
    private String year_of_entarance="";
    private String student_contact_number="";
    private int is_current_student;
    private LocalDateTime created_or_updated_at = LocalDateTime.now();

    public Student(int stid, int is_current_student) {
        this.stid = stid;
        this.is_current_student = is_current_student;
        LocalDateTime updated_at = this.created_or_updated_at;
        
    }        

    public Student() {
    }

    public String getYear_of_entarance() {
        return year_of_entarance;
    }

    public void setYear_of_entarance(String year_of_entarance) {
        this.year_of_entarance = year_of_entarance;
    }
    
    public String getStudent_contact_number() {
        return student_contact_number;
    }

    public void setStudent_contact_number(String student_contact_number) {
        this.student_contact_number = student_contact_number;
    }    

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public String getGrade_in_year_of_entarance() {
        return grade_in_year_of_entarance;
    }

    public void setGrade_in_year_of_entarance(String grade_in_year_of_entarance) {
        this.grade_in_year_of_entarance = grade_in_year_of_entarance;
    }
    
    public String getStudent_birthday() {
        return student_birthday;
    }

    public void setStudent_birthday(String student_birthday) {
        this.student_birthday = student_birthday;
    }

    public String getStudent_identity_code() {
        return student_identity_code;
    }

    public void setStudent_identity_code(String student_identity_code) {
        this.student_identity_code = student_identity_code;
    }

    public String getStudent_passport_number() {
        return student_passport_number;
    }

    public void setStudent_passport_number(String student_passport_number) {
        this.student_passport_number = student_passport_number;
    }

    public String getStudent_photo_file_path() {
        return student_photo_file_path;
    }

    public void setStudent_photo_file_path(String student_photo_file_path) {
        this.student_photo_file_path = student_photo_file_path;
    }

    public String getDate_of_entarance() {
        return date_of_entarance;
    }

    public void setDate_of_entarance(String date_of_entarance) {
        this.date_of_entarance = date_of_entarance;
    }
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();
    
    public int addStudent() throws SQLException{
        int returnstatus = 0;

        PreparedStatement prep = null;
        PreparedStatement prep_stmt = null;
        ResultSet result = null;     
        
        String query = "select student_id from student where student_ic = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getStudent_identity_code());
            result = prep.executeQuery();
            while(result.next()){
                returnstatus = 1;
            }
            if(returnstatus < 1){
                String q = "insert into student (grade_in_year_of_entarance, is_current_student, record_created_at, record_created_by, student_birthday, student_ic, student_passport_number, student_photo_file_path, date_of_entarance, student_name, student_address, student_contact_number, year_of_entarance) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                prep_stmt = con.prepareStatement(q);
                prep_stmt.setString(1, this.getGrade_in_year_of_entarance());
                prep_stmt.setInt(2, 1);
                prep_stmt.setTimestamp(3, Timestamp.valueOf(this.created_or_updated_at));
                prep_stmt.setInt(4, this.record_created_or_updated_by);
                prep_stmt.setString(5, this.getStudent_birthday());
                prep_stmt.setString(6, this.getStudent_identity_code());
                prep_stmt.setString(7, this.getStudent_passport_number());
                prep_stmt.setString(8, this.getStudent_photo_file_path());
                prep_stmt.setString(9, this.getDate_of_entarance());
                prep_stmt.setString(10, this.getStudent_name());
                prep_stmt.setString(11, this.getStudent_address());
                prep_stmt.setString(12, this.getStudent_contact_number());
                prep_stmt.setString(13, this.getYear_of_entarance());
                
                int count = prep_stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            returnstatus = -1;
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){}
                result = null;
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep=null;
            }
            if(prep_stmt != null){
                try{
                    prep_stmt.close();
                }catch(SQLException ex){}
                prep_stmt = null;
            }
            con.close();
        }
        return returnstatus;
    }
    
    public List<String> get_student_info_by_text(String text){
        PreparedStatement prep = null;
        ResultSet result = null;
        List<String> lst = new ArrayList<String>();
        
        String query = "select student_id, student_name from student where student_name like ? or student_ic like ? or student_passport_number like ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1,"%"+text+"%");
            prep.setString(2,"%"+text+"%");
            prep.setString(3,"%"+text+"%");
            result = prep.executeQuery();
            int count = 0;
            while(result.next()){
                String id = Integer.toString(result.getInt("student_id"));
                String name = result.getString("student_name");
                String row = id+"-"+name;
                lst.add(count, row);
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }            
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lst;
    }
    
    public HashMap getListOfStudentRecords(String std_name, String std_code, String medical_status, int grade, String school){
    
        PreparedStatement prep = null;
        ResultSet rs = null;
        
        String qry_std_name = "";
        String qry_std_code = "";
        String qry_medical_status = "";
        String qry_grade = "";
        String qry_school = "";
        
        int count = 1;
        int count_std_name = 0;
        int count_std_code = 0;
        int count_medical_status = 0;
        int count_grade = 0;
        int count_school = 0;
        
        int cnt = 0;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
            
        //String query = "select (grade_in_year_of_entarance + TIMESTAMPDIFF(YEAR, student.year_of_entarance, CURDATE())) as current_grade, student.student_id, student_name, student_birthday from student inner join student_medical_requirements on student.student_id = student_medical_requirements.student_id inner join medical_requirements on student_medical_requirements.medical_requirement_id = medical_requirements.medical_requirement_id inner join student_school on student.student_id = student_school.student_id inner join school on student_school.school_id = school.school_id where student.student_id > ?";
        String query = "select (grade_in_year_of_entarance + TIMESTAMPDIFF(YEAR, student.year_of_entarance, CURDATE())) as current_grade, student.student_id, student_name, student_birthday from student left outer join student_medical_requirements on student.student_id = student_medical_requirements.student_id left outer join medical_requirements on student_medical_requirements.medical_requirement_id = medical_requirements.medical_requirement_id left outer join student_school on student.student_id = student_school.student_id left outer join school on student_school.school_id = school.school_id where student.student_id > ?";
        
        try{            
            if(!std_name.equals("")){
                qry_std_name = " and student.student_name like ?";
                count++;
                count_std_name = count;
            }
            if(!std_code.equals("")){
                qry_std_code = " and student.student_ic = ?";
                count++;
                count_std_code = count;
            }
            if(!medical_status.equals("")){
                qry_medical_status = " and medical_requirements.desease_name like ?";
                count++;
                count_medical_status = count;
            }
            if(grade > 0){
                qry_grade = " and student.grade_in_year_of_entarance = (select ? - TIMESTAMPDIFF(YEAR, student.year_of_entarance, CURDATE()))";
                count++;
                count_grade = count;
            }
            if(!school.equals("")){
                qry_school = " and school.school_name = ?";
                count++;
                count_school = count;
            }
            
            query = query + qry_std_name + qry_std_code + qry_medical_status + qry_grade + qry_school;
            
            prep = con.prepareStatement(query);
            prep.setInt(1,0);
            if(!std_name.equals("")){
                prep.setString(count_std_name, "%" + std_name + "%");
            }
            if(!std_code.equals("")){
                prep.setString(count_std_code, std_code);
            }
            if(!medical_status.equals("")){
                prep.setString(count_medical_status, "%" + medical_status + "%");
            }
            if(grade > 0){
                //grade = 8;
                prep.setInt(count_grade, grade);
            }
            if(!school.equals("")){
                prep.setString(count_school, school);
            }
            rs = prep.executeQuery();
            System.out.println("result set: " + rs);
            
            while(rs.next()){
                
                Map<Integer, String> mp = new HashMap<Integer,String>();
                String student_id = Integer.toString(rs.getInt("student.student_id"));
                String student_name = rs.getString("student_name");
                String dob = rs.getString("student_birthday");
                String grde = Integer.toString(rs.getInt("current_grade"));
                mp.put(0, student_id);
                mp.put(1, student_name);
                mp.put(2, dob);
                mp.put(3, grde);
                hm.put(cnt, mp);
                cnt++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }            
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hm;
    }
    
    public List get_student_details_by_id(int student_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        List<String> l = new ArrayList<String>();
        
        String query = "select student_name, student_address, student_birthday, student_contact_number, student_photo_file_path, student_ic, student_passport_number, date_of_entarance, grade_in_year_of_entarance from student where student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            while(result.next()){
                l.add(0, result.getString("student_name"));
                l.add(1, result.getString("student_address"));
                l.add(2, result.getString("student_birthday"));
                l.add(3, result.getString("student_contact_number"));
                l.add(4, result.getString("student_photo_file_path"));
                l.add(5, result.getString("student_ic"));
                l.add(6, result.getString("student_passport_number"));
                l.add(7, result.getString("date_of_entarance"));
                l.add(8, result.getString("grade_in_year_of_entarance"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }            
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return l;
    }
    
    public int updade_as_old_student(int student_id){
        int i = 0;
        PreparedStatement prep = null;
        
        String query = "update student set is_current_student = ? where student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, 0);
            prep.setInt(2, student_id);
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return i;
    }
    
    public int update_student(){
        PreparedStatement prep = null;
        int i = -1;
        String query = "update student set student_name = ?, student_address = ?, student_birthday = ?, student_contact_number = ?, student_photo_file_path = ?, student_ic = ?, student_passport_number = ?, date_of_entarance = ?, year_of_entarance = ?, grade_in_year_of_entarance = ?, record_updated_by = ?, record_updated_at = ? where student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getStudent_name());
            prep.setString(2, this.getStudent_address());
            prep.setString(3, this.getStudent_birthday());
            prep.setString(4, this.getStudent_contact_number());
            prep.setString(5, this.getStudent_photo_file_path());
            prep.setString(6, this.getStudent_identity_code());
            prep.setString(7, this.student_passport_number);
            prep.setString(8, this.date_of_entarance);
            prep.setString(9, this.year_of_entarance);
            prep.setInt(10, Integer.parseInt(this.grade_in_year_of_entarance));
            prep.setInt(11, this.record_created_or_updated_by);
            prep.setTimestamp(12, Timestamp.valueOf(this.created_or_updated_at));
            prep.setInt(13, this.getStid());
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return i;
    }
    
    public HashMap get_student_information_by_id(int student_id){
        PreparedStatement prep = null;
        ResultSet result = null;
        
        HashMap<String,String> l = new HashMap<String,String>();
        
        String query = "select student_name, student_address, student_birthday, student_contact_number, student_photo_file_path, student_ic, student_passport_number, date_of_entarance, grade_in_year_of_entarance from student where student_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            while(result.next()){
                l.put("Student name:", result.getString("student_name"));
                l.put("Student address:", result.getString("student_address"));
                l.put("Student birthday:", result.getString("student_birthday"));
                l.put("Student Contact number:", result.getString("student_contact_number"));
                l.put("Student photo:", result.getString("student_photo_file_path"));
                l.put("Student identity code:", result.getString("student_ic"));
                l.put("Student passport number:", result.getString("student_passport_number"));
                l.put("Date of entarance:", result.getString("date_of_entarance"));
                l.put("Grade in year of entarance:", result.getString("grade_in_year_of_entarance"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }            
            }
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){ System.out.println(ex.getMessage()); }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OldStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return l;
    }
    
}
