/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex24;

/*
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments
and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */

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
