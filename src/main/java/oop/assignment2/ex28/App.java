/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex28;

/*
In previous programs, you asked the user for repeated input by writing the input statements multiple times.
But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double[] array = new double[5];

        // prompt for 5 num
        for (int i = 0; i < 5; i++) {
             array[i] =  myApp.readNum();
        }
        double total = myApp.addNumbers(array);
        String generateOutput = myApp.output(total);
        myApp.print(generateOutput);
    }

    public double readNum() {
        System.out.print("Enter a number: ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double addNumbers(double[] intArray) {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += intArray[i];
        }

        return total;
    }

    public String output(double total) {
        return String.format("The total is %.0f.", total);
    }

    public void print(String output) {
        System.out.println(output);
    }

}
