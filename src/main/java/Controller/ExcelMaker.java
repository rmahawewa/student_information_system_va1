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
    
    public int return_count(){
    /***    for method - get_student_info   ***/
        return count++;
    }
    
    public boolean get_student_info(int student_id, HashMap student_info) throws FileNotFoundException, IOException{
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
