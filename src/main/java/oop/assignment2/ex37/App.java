/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex37;

/*
Coming up with a password that meets specific requirements is something your
computer can do.
 And it will give you practice using random number generators in conjunction
 with a list of known values.

Create a program that generates a secure password. Prompt the user for the
 minimum length,
the number of special characters, and the number of numbers. T
hen generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special
characters and number.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PasswordRandomnizer randomnizer = new PasswordRandomnizer();

        int minLength = myApp.readInt("What's the minimum length? ");
        int specialChar = myApp.readInt("How many special characters? ");
        int numNums = myApp.readInt("How many numbers? ");

        StringBuilder output = randomnizer.randomnize(numNums, specialChar, minLength);


    }

    public int readInt(String prompt) {
        System.out.print(prompt);

        // User can only enter number
        while (!in.hasNextInt()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public void displayOutput(StringBuilder output) {
        System.out.print(output);
    }
}
