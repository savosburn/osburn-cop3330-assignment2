/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        FilterString filter = new FilterString();

        String list = myApp.readInput();

        ArrayList<Integer> allInts;
        ArrayList<Integer> evens;

        allInts = filter.allNumbers(list);
        evens = filter.evenNumbers(allInts);

        String output = myApp.generateOutput(evens);
        myApp.output(output);
    }

    public String readInput() {
        System.out.print("Enter a list of numbers, separated by spaces: ");

        return in.nextLine();
    }

    public String generateOutput(ArrayList<Integer> evens) {
        String output = "The even numbers are ";

        if (evens.isEmpty()){
            return "There are no even numbers.";
        }

        for (Integer even : evens) {
            output += even + " ";
        }

        return output;
    }

    public void output (String output) {
        System.out.println(output);
    }
}
