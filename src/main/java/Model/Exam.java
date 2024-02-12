/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DatabaseConnection.ConnectionString;
import Model.LoggedInUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Exam {
    
    private int exam_id;
    private String exam_code;
    private String exam_name;
    private String year;
    private String semester;
    private String from_date;
    private String to_date;
    private String details;
    private int created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();
    
    private ConnectionString con_str = new ConnectionString();
    private Connection con = con_str.getCon();

    public Exam() {
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getExam_code() {
        return exam_code;
    }

    public void setExam_code(String exam_code) {
        this.exam_code = exam_code;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
           
    
    public int addExam() throws SQLException{
        int ret_stts = 0;

        PreparedStatement prep = null;
        
        String query = "insert into exam(exam_code,year,semester,from_date,to_date,exam_name,details,record_created_by,record_created_at) values (?,?,?,?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getExam_code()); 
            prep.setString(2, this.getYear());
            prep.setString(3,this.getSemester());
            prep.setDate(4, java.sql.Date.valueOf(this.getFrom_date()));
            prep.setDate(5, java.sql.Date.valueOf(this.getTo_date()));
//            prep.setDate(4, java.sql.Date.valueOf("2024-04-03"));
//            prep.setDate(5, java.sql.Date.valueOf("2024-04-08"));
            prep.setString(6,this.getExam_name());
            prep.setString(7, this.getDetails());
            prep.setInt(8, this.created_or_updated_by);
            prep.setTimestamp(9, Timestamp.valueOf(this.created_or_updated_at));
            
            int r = prep.executeUpdate();
            System.out.println("the r is:"+r);
        } catch (SQLException ex) {
            ret_stts = -1;
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep = null;
            }
            con.close();
        }
        
        return ret_stts;
    }
    
    public HashMap getExamDataByInfo(String exam_name, String exam_code, String yr, String semester) throws SQLException{

        PreparedStatement prep = null;
        ResultSet rs = null;
        
        Map<Integer, Map<Integer,String>> exam_list = new HashMap<Integer, Map<Integer,String>>();
        
        int count = 1;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        String examNameQuery = "";
        String examCodeQuery = "";
        String yearQuery = "";
        String semesterQuery = "";
                        
        try{
            String query = "select exam_id,exam_name,semester,from_date,to_date from exam where exam_id > ?";
        
            if(!exam_name.equals("")){
                examNameQuery = " and exam_name = ?";
                count++;
                count1 = count;
            }
            if(!exam_code.equals("")){
                examCodeQuery = " and exam_code = ?";
                count++;
                count2 = count;
            }
            if(!yr.equals("")){
                yearQuery = " and year = ?";
                count++;
                count3 = count;
            }        
            if(!semester.equals("")){
                semesterQuery = " and semester = ?";
                count++;
                count4 = count;
            }

            query = query + examNameQuery + examCodeQuery + yearQuery + semesterQuery;
            prep = con.prepareStatement(query);

            prep.setInt(1, 0);

            if(count1 > 1){
                prep.setString(count1, exam_name);
            }
            if(count2 > 1){
                prep.setString(count2, exam_code);
            }
            if(count3 > 1){
                prep.setString(count3, yr);
            }
            if(count4 > 1){
                prep.setString(count4, semester);
            }

            rs = prep.executeQuery();

            int cnt=0;
            while(rs.next()){
                int exam_id = rs.getInt("exam_id");
                String em_name = rs.getString("exam_name");
                String sems = rs.getString("semester");
                String strt_date = rs.getDate("from_date").toString();
                String end_date = rs.getDate("to_date").toString();

                Map<Integer,String> row = new HashMap<Integer,String>();
                row.put(0, Integer.toString(exam_id));
                row.put(1, em_name);
                row.put(2, sems);
                row.put(3, strt_date);
                row.put(4, end_date);

                exam_list.put(cnt, row);
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
        return (HashMap) exam_list;
    }
    
    public HashMap getGivenExamInfo(int id){
        Map<Integer, String> hm = new HashMap<Integer,String>();
        
        ResultSet result = null;
        PreparedStatement prep = null;
        
        String query = "select exam_id,exam_code,exam_name,year,semester,from_date,to_date,details from exam where exam_id=? ";
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, id);
            result = prep.executeQuery();
            while(result.next()){
                String exm_id = Integer.toString(result.getInt("exam_id"));
                String exm_code = result.getString("exam_code");
                String exm_name = result.getString("exam_name");
                String yr = result.getString("year");
                String semester = result.getString("semester");
                String from_date = result.getDate("from_date").toString();
                String to_date = result.getDate("to_date").toString();
                String details = result.getString("details");
                
                hm.put(0, exm_id);
                hm.put(1, exm_code);
                hm.put(2, exm_name);
                hm.put(3, yr);
                hm.put(4, semester);
                hm.put(5, from_date);
                hm.put(6, to_date);
                hm.put(7, details);
                                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (HashMap) hm;
    }
    
    public int updateExam() throws SQLException{
        int stts = 1;

        PreparedStatement prep = null;
        
        String query = "update exam set exam_name = ?, exam_code = ?, year = ?, semester = ?, from_date = ?, to_date = ?, details = ?, record_updated_by = ?, record_updated_at = ? where exam_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getExam_name());
            prep.setString(2, this.getExam_code());
            prep.setString(3, this.getYear());
            prep.setString(4, this.getSemester());
            prep.setDate(5, java.sql.Date.valueOf(this.getFrom_date()));
            prep.setDate(6, java.sql.Date.valueOf(this.getTo_date()));
            prep.setString(7, this.getDetails());
            prep.setInt(8, created_or_updated_by);
            prep.setTimestamp(9, Timestamp.valueOf(created_or_updated_at));
            prep.setInt(10, this.getExam_id());
            stts = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
            stts = -1;
        }finally{
            if(prep != null){
                try{
                    prep.close();
                }catch(SQLException ex){}
                prep.close();
            }
            con.close(); 
        }
        return stts;
    }
    
}
