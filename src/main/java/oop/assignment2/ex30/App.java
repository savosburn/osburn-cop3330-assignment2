/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex30;

public class App {
    public static void main(String[] args) {
        App myApp = new App();
        TableCreator table = new TableCreator();

        String multTable = table.createTable();

        myApp.output(multTable);
    }

    public void output(String output) {
        System.out.println(output);
    }
}

