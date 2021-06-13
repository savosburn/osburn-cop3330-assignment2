/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        CreateRecords records  = new CreateRecords();
        RecordSearcher search  = new RecordSearcher();
        OutputGenerator generator = new OutputGenerator();

        ArrayList<HashMap<String, String>> employees = records.employeeRecords();
        String userSearch = myApp.userSearch();
        ArrayList<HashMap<String, String>> filtered = search.searchRecords(employees, userSearch);

        String output = generator.generateOutput(filtered);
        myApp.output(output);
    }

    public String userSearch() {
        System.out.print("Enter a search string: ");

        return in.nextLine();
    }

    public void output(String output) {
        System.out.println(output);
    }
}
