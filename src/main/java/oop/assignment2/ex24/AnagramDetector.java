/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex24;

import java.util.Arrays;

public class AnagramDetector {

    public boolean isSameLength(String stringOne, String stringTwo) {
        return (stringOne.length() == stringTwo.length());
    }

    public boolean isAnagram(boolean sameLength, String str1, String str2) {

        if (sameLength) {
            if (str1.equals(str2)) {
                return true;
            }

            char[] strOne = str1.toCharArray();
            char[] strTwo = str2.toCharArray();

            Arrays.sort(strOne);
            Arrays.sort(strTwo);

            return Arrays.equals(strOne, strTwo);

        }

        return false;
    }
}
