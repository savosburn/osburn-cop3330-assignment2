/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex24;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        AnagramDetector detector = new AnagramDetector();

        // Input
        String stringOne = myApp.readString("Enter the first string: ");
        String stringTwo = myApp.readString("Enter the second string: ");

        // Calculations
        boolean sameLength = detector.isSameLength(stringOne, stringTwo);
        boolean isAnagram = detector.isAnagram(sameLength, stringOne, stringTwo);

        // Output
        String output = myApp.generateOutput(isAnagram, stringOne, stringTwo);
        myApp.output(output);
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public String generateOutput(boolean isAnagram, String str1, String str2) {
        if (isAnagram) {
            return String.format("\"%s\" and \"%s\" are anagrams.", str1, str2);
        }

        return String.format("\"%s\" and \"%s\" are not anagrams.", str1, str2);
    }

    public void output(String output) {
        System.out.println(output);
    }
}
