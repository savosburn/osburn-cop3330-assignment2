/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex28;

public class App {
    public static void main(String[] args) {
        App myApp = new App();
        Adder add = new Adder();

        double total = add.addInts();

        String generateOutput = myApp.output(total);
        myApp.print(generateOutput);
    }

    public String output(double total) {
        return String.format("The total is %.0f.", total);
    }

    public void print(String output) {
        System.out.println(output);
    }

}
