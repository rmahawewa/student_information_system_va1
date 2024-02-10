/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.LoggedInUser;
import java.time.LocalDateTime;
import DatabaseConnection.ConnectionString;
import java.sql.Connection;

/**
 *
 * @author HP
 */
public class StudentAssesmentExam {
    
    private int std_asmt_exam_id;
    private int exam_asmt_id;
    private int stdnt_id;
    private String marks;
    private String remarks;
    private String description;
    private int created_or_updated_by = LoggedInUser.getLogged_in_user();
    private LocalDateTime created_or_updated_at = LocalDateTime.now();
    
    ConnectionString con_str = new ConnectionString();
    Connection con = con_str.getCon();
    
    
}
