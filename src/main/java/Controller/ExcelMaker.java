/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author HP
 */
public class ExcelMaker {
    
    static int count = 2;
    static int count_fm = 2;
    static int count_scl = 2;
    static int count_asmt = 2;
    static int count_exam = 2;
    static int count_md = 2;
    
    public int return_count(){
    /***    for method - get_student_info   ***/
        return count++;
    }
    
    public int return_count_fm(){
    /***    for method - get_student_info   ***/
        return count_fm++;
    }
    
    public int return_count_scl(){
    /***    for method - get_student_info   ***/
        return count_scl++;
    }
    
    public int return_count_asmt(){
    /***    for method - get_student_info   ***/
        return count_asmt++;
    }
    
    public int return_count_exam(){
    /***    for method - get_student_info   ***/
        return count_exam++;
    }
        
    public int return_count_md(){
    /***    for method - get_student_info   ***/
        return count_md++;
    }
    
    
    
    public boolean get_student_info(int student_id, HashMap student_info, HashMap family_member_info, HashMap student_school_info, HashMap student_assesment_info, HashMap student_exam_info, HashMap student_medical_info) throws FileNotFoundException, IOException{
        boolean returnstatus = true;

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("StudentInfo");
        sheet.setColumnWidth(0, 5000);
        sheet.setColumnWidth(1, 6000);

        XSSFRow header = sheet.createRow(0);

        CellStyle header_style = workbook.createCellStyle();

        XSSFFont font = workbook.createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 14);
        font.setBold(true);
        header_style.setFont(font);

        XSSFCell headercell = header.createCell(0);
        headercell.setCellValue("Student Information");
        headercell.setCellStyle(header_style);

        CellStyle cellstyle = workbook.createCellStyle();
        cellstyle.setWrapText(true);

        XSSFRow row = sheet.createRow(1);
        XSSFCell cell = row.createCell(0);

        student_info.forEach(new BiConsumer<String, String>() {

            @Override
            public void accept(String key, String value) {

                XSSFRow row;
                int c = return_count();
                row = sheet.createRow(c);

                XSSFCell cell = row.createCell(0);
                cell.setCellValue(key);
                cell.setCellStyle(cellstyle);

                cell=row.createCell(1);
                cell.setCellValue(value);
                cell.setCellStyle(cellstyle);            

            }

        });
        
        
        XSSFSheet sheet_family = workbook.createSheet("StudentFamilyInfo");
        sheet_family.setColumnWidth(0, 5000);
        sheet_family.setColumnWidth(1, 6000);

        XSSFRow header_fm = sheet_family.createRow(0);

        CellStyle header_style_fm = workbook.createCellStyle();

        XSSFFont font_fm = workbook.createFont();
        font_fm.setFontName("Arial");
        font_fm.setFontHeightInPoints((short) 14);
        font_fm.setBold(true);
        header_style_fm.setFont(font_fm);

        XSSFCell headercell_fm = header_fm.createCell(0);
        headercell_fm.setCellValue("Student Family Information");
        headercell_fm.setCellStyle(header_style);

        CellStyle cellstyle_fm = workbook.createCellStyle();
        cellstyle_fm.setWrapText(true);

        XSSFRow row_fm = sheet_family.createRow(1);
        XSSFCell cell_fm = row.createCell(0);

        family_member_info.forEach(new BiConsumer<Integer, Map<String,String>>() {

            @Override
            public void accept(Integer t, Map<String, String> u) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //HashMap<String, String> hm = (HashMap<String, String>) u;
                u.forEach(new BiConsumer<String, String>(){
                    @Override
                    public void accept(String t, String u) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        
                        XSSFRow row;
                        int c = return_count_fm();
                        row = sheet_family.createRow(c);

                        XSSFCell cell = row.createCell(0);
                        cell.setCellValue(t);
                        cell.setCellStyle(cellstyle_fm);

                        cell=row.createCell(1);
                        cell.setCellValue(u);
                        cell.setCellStyle(cellstyle_fm);
                        
                    }
                
                });
                return_count_fm();
                return_count_fm();
                return_count_fm();
            }

        });
        
        
        XSSFSheet sheet_school = workbook.createSheet("StudentSchoolInfo");
        sheet_school.setColumnWidth(0, 5000);
        sheet_school.setColumnWidth(1, 6000);

        XSSFRow header_scl = sheet_school.createRow(0);

        CellStyle header_style_scl = workbook.createCellStyle();

        XSSFFont font_scl = workbook.createFont();
        font_scl.setFontName("Arial");
        font_scl.setFontHeightInPoints((short) 14);
        font_scl.setBold(true);
        header_style_scl.setFont(font_scl);

        XSSFCell headercell_scl = header_scl.createCell(0);
        headercell_scl.setCellValue("Student School Information");
        headercell_scl.setCellStyle(header_style);

        CellStyle cellstyle_scl = workbook.createCellStyle();
        cellstyle_scl.setWrapText(true);

        XSSFRow row_scl = sheet_school.createRow(1);
        XSSFCell cell_scl = row.createCell(0);

        student_school_info.forEach(new BiConsumer<Integer, Map<String,String>>() {

            @Override
            public void accept(Integer t, Map<String, String> u) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //HashMap<String, String> hm = (HashMap<String, String>) u;
                u.forEach(new BiConsumer<String, String>(){
                    @Override
                    public void accept(String t, String u) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        
                        XSSFRow row;
                        int c = return_count_scl();
                        row = sheet_school.createRow(c);

                        XSSFCell cell = row.createCell(0);
                        cell.setCellValue(t);
                        cell.setCellStyle(cellstyle_scl);

                        cell=row.createCell(1);
                        cell.setCellValue(u);
                        cell.setCellStyle(cellstyle_scl);
                        
                    }
                
                });
                return_count_scl();
                return_count_scl();
                return_count_scl();
            }

        });
        
        
        XSSFSheet sheet_assesment = workbook.createSheet("StudentAssesmentPerformance");
        sheet_assesment.setColumnWidth(0, 5000);
        sheet_assesment.setColumnWidth(1, 6000);

        XSSFRow header_asmt = sheet_assesment.createRow(0);

        CellStyle header_style_asmt = workbook.createCellStyle();

        XSSFFont font_asmt = workbook.createFont();
        font_asmt.setFontName("Arial");
        font_asmt.setFontHeightInPoints((short) 14);
        font_asmt.setBold(true);
        header_style_asmt.setFont(font_asmt);

        XSSFCell headercell_asmt = header_asmt.createCell(0);
        headercell_asmt.setCellValue("Student Assesment Performance");
        headercell_asmt.setCellStyle(header_style_asmt);

        CellStyle cellstyle_asmt = workbook.createCellStyle();
        cellstyle_asmt.setWrapText(true);

        XSSFRow row_asmt = sheet_assesment.createRow(1);
        XSSFCell cell_asmt = row_asmt.createCell(0);

        student_assesment_info.forEach(new BiConsumer<Integer, Map<String,String>>() {

            @Override
            public void accept(Integer t, Map<String, String> u) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //HashMap<String, String> hm = (HashMap<String, String>) u;
                u.forEach(new BiConsumer<String, String>(){
                    @Override
                    public void accept(String t, String u) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        
                        XSSFRow row;
                        int c = return_count_asmt();
                        row = sheet_assesment.createRow(c);

                        XSSFCell cell = row.createCell(0);
                        cell.setCellValue(t);
                        cell.setCellStyle(cellstyle_asmt);

                        cell=row.createCell(1);
                        cell.setCellValue(u);
                        cell.setCellStyle(cellstyle_asmt);
                        
                    }
                
                });
                return_count_asmt();
                return_count_asmt();
                return_count_asmt();
            }

        });
        
        
        XSSFSheet sheet_exam = workbook.createSheet("StudentExamPerformance");
        sheet_assesment.setColumnWidth(0, 5000);
        sheet_assesment.setColumnWidth(1, 6000);

        XSSFRow header_exam = sheet_exam.createRow(0);

        CellStyle header_style_exam = workbook.createCellStyle();

        XSSFFont font_exam = workbook.createFont();
        font_exam.setFontName("Arial");
        font_exam.setFontHeightInPoints((short) 14);
        font_exam.setBold(true);
        header_style_exam.setFont(font_exam);

        XSSFCell headercell_exam = header_exam.createCell(0);
        headercell_exam.setCellValue("Student Exam Performance");
        headercell_exam.setCellStyle(header_style_exam);

        CellStyle cellstyle_exam = workbook.createCellStyle();
        cellstyle_exam.setWrapText(true);

        XSSFRow row_exam = sheet_exam.createRow(1);
        XSSFCell cell_exam = row_exam.createCell(0);

        student_exam_info.forEach(new BiConsumer<Integer, Map<String,String>>() {

            @Override
            public void accept(Integer t, Map<String, String> u) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //HashMap<String, String> hm = (HashMap<String, String>) u;
                u.forEach(new BiConsumer<String, String>(){
                    @Override
                    public void accept(String t, String u) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        
                        XSSFRow row;
                        int c = return_count_exam();
                        row = sheet_exam.createRow(c);

                        XSSFCell cell = row.createCell(0);
                        cell.setCellValue(t);
                        cell.setCellStyle(cellstyle_exam);

                        cell=row.createCell(1);
                        cell.setCellValue(u);
                        cell.setCellStyle(cellstyle_exam);
                        
                    }
                
                });
                return_count_exam();
                return_count_exam();
                return_count_exam();
            }

        });
        
        
        XSSFSheet sheet_md = workbook.createSheet("StudentMedicalInfo");
        sheet_md.setColumnWidth(0, 5000);
        sheet_md.setColumnWidth(1, 6000);

        XSSFRow header_md = sheet_md.createRow(0);

        CellStyle header_style_md = workbook.createCellStyle();

        XSSFFont font_md = workbook.createFont();
        font_md.setFontName("Arial");
        font_md.setFontHeightInPoints((short) 14);
        font_md.setBold(true);
        header_style_md.setFont(font_md);

        XSSFCell headercell_md = header_md.createCell(0);
        headercell_md.setCellValue("Student Medical Information");
        headercell_md.setCellStyle(header_style_md);

        CellStyle cellstyle_md = workbook.createCellStyle();
        cellstyle_md.setWrapText(true);

        XSSFRow row_md = sheet_md.createRow(1);
        XSSFCell cell_md = row_md.createCell(0);

        student_medical_info.forEach(new BiConsumer<Integer, Map<String,String>>() {

            @Override
            public void accept(Integer t, Map<String, String> u) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //HashMap<String, String> hm = (HashMap<String, String>) u;
                u.forEach(new BiConsumer<String, String>(){
                    @Override
                    public void accept(String t, String u) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        
                        XSSFRow row;
                        int c = return_count_md();
                        row = sheet_md.createRow(c);

                        XSSFCell cell = row.createCell(0);
                        cell.setCellValue(t);
                        cell.setCellStyle(cellstyle_md);

                        cell=row.createCell(1);
                        cell.setCellValue(u);
                        cell.setCellStyle(cellstyle_md);
                        
                    }
                
                });
                return_count_md();
                return_count_md();
                return_count_md();
            }

        });
        

        //File current_dir = new File("./spreadsheets/.");
        File current_dir = new File(".");
        String path = current_dir.getAbsolutePath();

        LocalDateTime time_now = LocalDateTime.now();
        Timestamp ts = Timestamp.valueOf(time_now);
        Long ms = ts.getTime();
        String date_time_ms = Long.toString(ms);
        String file_name = "userInformation_"+ student_id + "_" + date_time_ms + ".xlsx";

        String file_location = path.substring(0, path.length()-1) + file_name;

        FileOutputStream outputstream = new FileOutputStream(file_location);
        workbook.write(outputstream);
        workbook.close();

        return returnstatus;
    }
    
}
