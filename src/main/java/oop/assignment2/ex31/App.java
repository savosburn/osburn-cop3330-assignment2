/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex31;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        TableCreator table = new TableCreator();

        double pulse = myApp.userInput("Resting Pulse: ");
        double age = myApp.userInput("Age: ");

        String newTable = table.createTable(pulse, age);
        myApp.output(newTable);
    }

    public double userInput(String prompt) {
        System.out.print(prompt);

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public void output(String table) {
        System.out.println(table);
    }
}
