/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex25;

public class PasswordValidator {
    private static final int PREFERRED_LENGTH = 8;

    public int passwordValidator(String password) {
        int vWeak = 0, weak = 1, strong = 2, vStrong = 3;

        int numNums = numInts(password);
        int numSpecialChars = numSpecialChars(password);

        if (password.length() < PREFERRED_LENGTH) {
            if (numNums == password.length()) {
                return vWeak;
            }
            return weak;
        }

        else {
            if (numNums > 0 && numSpecialChars == 0) {
                return strong;
            }

            return vStrong;
        }
    }

    public int numInts(String password) {
        int numNums = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numNums++;
            }
        }

        return numNums;
    }

    public int numSpecialChars(String password) {
        int numSpecialChars = 0;

        for (int i = 0; i < password.length(); i++) {
            int ascii = password.charAt(i);

            if (!Character.isDigit(password.charAt(i)) && !(ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122)) {
                numSpecialChars++;
            }
        }

        return numSpecialChars;
    }
}