/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserLibraries;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

/**
 *
 * @author HP
 */
public class GetTimes {
    
    private static LocalDateTime current_dt = LocalDateTime.now();
    
    private static Map<String,String> min = Map.ofEntries(
            entry("දුරුතු","01"),
            entry("නවම්","02"),
            entry("මැදින්","03"),
            entry("බක්","04"),
            entry("වෙසක්","05"),
            entry("පොසොන්","06"),
            entry("ඇසල","07"),
            entry("නිකිනි","08"),
            entry("බිනර","09"),
            entry("වප්","10"),
            entry("ඉල්","11"),
            entry("උදුවප්","12"));
    
    private static Map<String,String> mit = Map.ofEntries(
            entry("01","දුරුතු"),
            entry("02","නවම්"),
            entry("03","මැදින්"),
            entry("04","බක්"),
            entry("05","වෙසක්"),
            entry("06","පොසොන්"),
            entry("07","ඇසල"),
            entry("08","නිකිනි"),
            entry("09","බිනර"),
            entry("10","වප්"),
            entry("11","ඉල්"),
            entry("12","උදුවප්")
    );
    
    public static String getMonthNumber(String month){
        return min.get(month);
    }
    
    public static String getMonthText(String month){
        return mit.get(month);
    }
    
    public static String getCurrentYear(){
        return String.valueOf(current_dt.getYear());
    }
    
    public static String getCurrentMonth(){
        //return current_dt.getMonth();
        String mnth = String.valueOf(current_dt.getMonthValue());
        mnth = mnth.length()==1?("0"+mnth):mnth;
        System.out.println("current month: " + mnth);
        String mt = getMonthText(mnth);
        //System.out.println("current month in word:" + mt);
        return mt;
    }
    
    public static String getCurrentDay(){
        //LocalDateTime current_dt = LocalDateTime.of(2024, 01, 05, 10, 10);
        return (String.valueOf(current_dt.getDayOfMonth()).length()==2?(String.valueOf(current_dt.getDayOfMonth())):("0"+(current_dt.getDayOfMonth())));        
    }
    
    public static String[] getDateWithMonthName(String date){
        String date_elem[] = date.split("-");
        date_elem[1] = mit.get(date_elem[1]);
        return date_elem;
    }
    
}
