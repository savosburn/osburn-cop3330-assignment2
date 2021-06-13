/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex37;

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
        myApp.displayOutput(output);
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
