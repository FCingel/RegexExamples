package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//    The first three digits called the area number. The area number cannot be 000, 666, or between 900 and 999.
//    Digits four and five are called the group number and range from 01 to 99.
//    The last four digits are serial numbers from 0001 to 9999.

public class Main {

    public static void main(String[] args) {
        List<String> ssnList = new ArrayList<String>();

        //Valid SSNs
        ssnList.add("123-45-6789");
        ssnList.add("234-55-9898");
        ssnList.add("567-11-2366");
        ssnList.add("899-74-1596");


        //Invalid SSNs
        ssnList.add("000-12-3456");
        ssnList.add("666-12-3456");
        ssnList.add("901-12-3456");
        ssnList.add("55-123-4567");
        ssnList.add("123-456-7899");
        ssnList.add("888-29-25896");
        ssnList.add("555-1234567");

        String regex = "^(?!000|666)[0-8][0-9]{2}-[0-9][1-9]-[0-9]{3}[1-9]$";
        
        Pattern pattern = Pattern.compile(regex);           //ensures valid regex statement
        
        for (String ssn : ssnList) {
            Matcher matcher = pattern.matcher(ssn);
            System.out.println(matcher.matches() ? "Valid SSN:\t\t " + ssn : "Invalid SSN:\t " + ssn);
        }
    }
}