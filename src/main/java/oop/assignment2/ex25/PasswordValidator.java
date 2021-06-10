/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex25;


public class PasswordValidator {
    private static final int PREFERRED_LENGTH = 8;

    public int passwordValidator(String password) {
        int numNums = 0, numLetters = 0, numSpecialChars = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numNums++;
            }

            else {
                int ascii = password.charAt(i);
                if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                    numLetters++;
                }
                else {
                    numSpecialChars++;
                }
            }
        }

        if (password.length() < PREFERRED_LENGTH) {
            if (numNums == password.length()) {
                return 0; // very week
            }
            return 1; // weak
        }

        else {
           if (numNums > 0 && numSpecialChars == 0) {
               return 2;
           }

           return 3;
        }
    }

//    A very weak password contains only numbers and is fewer than eight characters.
//A weak password contains only letters and is fewer than eight characters.
//A strong password contains letters and at least one number and is at least eight characters.
//A very strong password contains letters, numbers, and special characters and is at least eight characters.
}
