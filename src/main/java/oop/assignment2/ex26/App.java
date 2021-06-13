/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex26;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PaymentCalculator paymentCalc = new PaymentCalculator();

        double balance = myApp.userInput("What is your balance? ");
        double apr = myApp.readAPR();
        double monthlyPay = myApp.userInput("What is the monthly payment you can make? ");

        double numMonths = paymentCalc.calculateMonthsUntilPaidOff(apr, balance, monthlyPay);

        String outputString = myApp.generateOutput(numMonths);
        myApp.output(outputString);
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

    public double readAPR() {
        System.out.print("What is the APR on the card (as a percent)?");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble() / 100;
    }

    public String generateOutput(double months) {
        return String.format("It will take you %.0f months to pay off this card.", months);
    }

    public void output(String output) {
        System.out.println(output);
    }
}