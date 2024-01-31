/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserLibraries;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class InputValidation {
    
    Pattern not_digit = Pattern.compile("[^0-9]");
    Pattern special = Pattern.compile("[!@#$%&*,.:;\"'/`()_+=|<>?{}\\[\\]~-]");
    Pattern certain = Pattern.compile("[\"\';?]");

    public InputValidation() {
    }
    
    public int check_on_certain_characters(String text){
        int i;
        Matcher m = certain.matcher(text);
        boolean b = m.find();
        i = b?(0):1;
        return i;
    }
    
    public int check_on_special_characters(String text){
        int i;
        Matcher m = special.matcher(text);
        boolean b = m.find();
        i=b?(0):1;
        return i;
    }
    
    public int check_for_number(String text){
        int i;
        Matcher m = not_digit.matcher(text);
        boolean b = m.find();
        i=b?(0):1;
        return i;
    }
    
    
}
