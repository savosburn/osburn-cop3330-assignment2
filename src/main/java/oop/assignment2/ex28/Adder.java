/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex28;

import java.util.Scanner;

public class Adder {
    private static final Scanner in = new Scanner(System.in);
    static final int TOTAL_INTS = 5;

    public double addInts() {
        Adder add = new Adder();

        double[] addNums = add.userInput();

        return add.addNumbers(addNums);
    }

    public double[] userInput() {
        double[] array = new double[TOTAL_INTS];
        for (int i = 0; i < TOTAL_INTS; i++) {
            array[i] =  readNum();
        }

        return array;
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

        for (int i = 0; i < TOTAL_INTS; i++) {
            total += intArray[i];
        }

        return total;
    }
}
