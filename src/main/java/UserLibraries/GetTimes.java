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
import java.util.Map;
import static java.util.Map.entry;

/**
 *
 * @author HP
 */
public class GetTimes {
    
    private static LocalDateTime current_dt = LocalDateTime.now();
    
    private static Map<String,String> min = Map.ofEntries(
            entry("January","01"),
            entry("February","02"),
            entry("March","03"),
            entry("April","04"),
            entry("May","05"),
            entry("June","06"),
            entry("July","07"),
            entry("August","08"),
            entry("September","09"),
            entry("October","10"),
            entry("November","11"),
            entry("December","12")
    );
    
    private static Map<String,String> mit = Map.ofEntries(
            entry("01","January"),
            entry("02","February"),
            entry("03","March"),
            entry("04","April"),
            entry("05","May"),
            entry("06","June"),
            entry("07","July"),
            entry("08","August"),
            entry("09","September"),
            entry("10","October"),
            entry("11","November"),
            entry("12","December")
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
    
}
