/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public String ValidateInput(String firstName, String lastName, String zipCode, String empID) {


        Validation validator = new Validation();

        String str1 = validator.invalidFirstName(firstName);
        String str2 = validator.invalidLastName(lastName);
        String str3 = validator.invalidZip(zipCode);
        String str4 = validator.invalidId(empID);

        return validator.concatenation(str1, str2, str3, str4);
    }

    public String invalidFirstName(String firstName) {
        String str1 = null;

        if (firstName.length() < 2) {
            str1 = "The first name must be at least 2 characters long.\n";

            if (firstName.isEmpty())
                str1 += "The first name must be filled in.\n";
        }

        return str1;
    }

    public  String invalidLastName(String lastName) {
        String str1 = null;

        if (lastName.length() < 2) {
            str1 = "The last name must be at least 2 characters long.\n";

            if (lastName.isEmpty())
                str1 += "The last name must be filled in.\n";
        }

        return str1;
    }

    public String invalidZip(String zipCode) {

        int numNum = 0;
        String str1 = null;

        for (int i = 0; i < zipCode.length(); i++) {
            if (Character.isDigit(zipCode.charAt(i))) {
                numNum++;
            }
        }

        if (numNum < 5) {
            str1 =  "The zipcode must be a 5 digit number.\n";

            if (numNum == 0 && zipCode.length() != 5) {
                str1 = str1 + "The zipcode must be filled in.\n";
            }
        }

        return str1;
    }

    public String invalidId(String empID) {
        String str1 = null;

        String re = "\\D\\D-\\d\\d\\d\\d";
        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(empID);

        boolean result = mt.matches();
        if (!result) {
            str1 = "The employee ID must be in the format of AA-1234.\n";

            if (empID.isEmpty()) {
                str1 += "The employee ID must be filled in.";
            }
        }

        return str1;
    }

    public String concatenation(String str1, String str2, String str3, String str4) {
        String result = null;
        String[] strings = {str1, str2, str3, str4};
        int counter = 0;

       for (int i = 0; i < 4; i++) {
           if (strings[i] != null){
               result = (strings[i]);
               counter++;
               break;
           }
       }

        for (int i = counter; i < 4; i++) {
            if (strings[i] != null){
                result += (strings[i]);
            }
            else {
                counter++;
            }
        }

       if (counter == 4) {
           return "There were no errors found.";
       }

       return result;
    }
}
