/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex29;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        InvestmentCalculator calc = new InvestmentCalculator();

        double rate = myApp.readRate();
        double years = calc.calculation(rate);

        String output = myApp.generateOutput(years);
        myApp.output(output);
    }

    public double readRate() {
        double userInput;

        while (true) {
            System.out.print("What is the rate of return? ");
            try {
                userInput = Double.parseDouble(in.next());
                if (userInput == 0) {
                    System.out.println("Sorry. That's not a valid input. ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. ");
            }
        }

        return userInput;
    }

    public String generateOutput(double years) {
        if (years % 1 == 0) {
            return String.format("It will take %.0f years to double your initial investment.", years);
        }

        return String.format("It will take %.02f years to double your initial investment.", years);
    }

    public void output(String output) {
        System.out.println(output);
    }
}
