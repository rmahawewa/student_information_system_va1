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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StudentFamilyMember {
    
    private int sfm_id;
    private int student_id;
    private String relationship;
    private String family_member_name;
    private String nic;
    private String career;
    private String birthday;
    private LocalDateTime record_created_or_updated_at = LocalDateTime.now();
    private int record_created_or_updated_by = LoggedInUser.getLogged_in_user();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();

    public StudentFamilyMember() {
        
    }

    public int getSfm_id() {
        return sfm_id;
    }

    public void setSfm_id(int sfm_id) {
        this.sfm_id = sfm_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getFamily_member_name() {
        return family_member_name;
    }

    public void setFamily_member_name(String family_member_name) {
        this.family_member_name = family_member_name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public HashMap get_student_family_member_details(int student_id) throws SQLException{
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int cnt = 0;
        HashMap<Integer, Map<Integer,String>> hm = new HashMap<Integer, Map<Integer,String>>();
        
        String query = "select sfm_id, nic, family_member_name, relationship from student_family_member where student_id = ?";
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            
            while(result.next()){
                int id = result.getInt("sfm_id");
                String nic = result.getString("nic");
                String family_member_name = result.getString("family_member_name");
                String relationship = result.getString("relationship");
                
                Map<Integer,String> mp = new HashMap<Integer,String>();
                mp.put(0, relationship);
                mp.put(1, family_member_name);
                mp.put(2, nic);
                mp.put(3, Integer.toString(id));
                hm.put(cnt, mp);
                cnt++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentFamilyMember.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
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
    
    public int add_student_family_member_information(){
        int i = 0;
        PreparedStatement prep = null;    
        
        String query = "insert into student_family_member (student_id, family_member_name, relationship, birthday, nic, career, record_created_by, record_created_at) values (?,?,?,?,?,?,?,?)";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, this.getStudent_id());
            prep.setString(2, this.getFamily_member_name());
            prep.setString(3, this.getRelationship());
            prep.setString(4, this.getBirthday());
            prep.setString(5, this.getNic());
            prep.setString(6, this.getCareer());
            prep.setInt(7, this.record_created_or_updated_by);
            prep.setTimestamp(8, Timestamp.valueOf(record_created_or_updated_at));
            
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentFamilyMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }   
    
    public List get_family_member_details_by_id(int sfm_id) throws SQLException{
        PreparedStatement prep = null;
        ResultSet result = null;
        
        List<String> l = new ArrayList<String>();
        
        String query = "select student_name, family_member_name, relationship, nic, career, birthday from student_family_member inner join student on student_family_member.student_id = student.student_id where sfm_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, sfm_id);
            result = prep.executeQuery();
            while(result.next()){
                l.add(0, result.getString("student_name"));
                l.add(1, result.getString("family_member_name"));
                l.add(2, result.getString("relationship"));
                l.add(3, result.getString("nic"));
                l.add(4, result.getString("birthday"));
                l.add(5, result.getString("career"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentFamilyMember.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
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
        return l;
    }
    
    public int update_student_family_member(){
        PreparedStatement prep = null;
        int i = 0;
        
        String query = "update student_family_member set birthday = ?, nic = ?, career = ? where sfm_id = ?";
        try {
            prep = con.prepareStatement(query);
            prep.setString(1, this.getBirthday());
            prep.setString(2, this.getNic());
            prep.setString(3, this.getCareer());
            prep.setInt(4, this.getSfm_id());
            i = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentFamilyMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public HashMap get_student_family_details(int student_id) throws SQLException{
        PreparedStatement prep = null;
        ResultSet result = null;
        
        int cnt = 0;
        HashMap<Integer, Map<String,String>> hm = new HashMap<Integer, Map<String,String>>();
        
        String query = "select family_member_name, relationship, nic, birthday, career from student_family_member where student_id = ?";
        
        try {
            prep = con.prepareStatement(query);
            prep.setInt(1, student_id);
            result = prep.executeQuery();
            
            while(result.next()){
                String nic = result.getString("nic");
                String family_member_name = result.getString("family_member_name");
                String relationship = result.getString("relationship");
                String birthday = result.getString("birthday");
                String career = result.getString("career");
                
                Map<String,String> mp = new HashMap<String,String>();                
                mp.put("Family member name:", family_member_name);
                mp.put("Relationship:", relationship);
                mp.put("NIC:", nic);
                mp.put("Birthday:", birthday);
                mp.put("Career:", career);
                hm.put(cnt, mp);
                cnt++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentFamilyMember.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
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
