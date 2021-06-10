/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex26;

/*
It can take a lot longer to pay off your credit card balance than you might realize.
And the formula for figuring that out isn’t pretty.
Hiding the formula’s complexity with a function can help you keep your code organized.

Write a program that will help you determine how many months it will take to pay off a credit card balance.
 The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment.
 The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.

Example Output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.

Constraints5
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
which returns the number of months.
Round fractions of a cent up to the next cent.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PaymentCalculator paymentCalc = new PaymentCalculator();

        // read in balance, read in apr, read in monthly payment
        double balance = myApp.userInput("What is your balance? ");
        double apr = myApp.readAPR();
        double monthlyPay = myApp.userInput("What is the monthly payment you can make? ");

        // calculate months
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