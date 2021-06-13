/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employeeList = list.employeeList();

        String display = myApp.displayList(employeeList);
        myApp.display(display);

        String removeEmp = myApp.readInput();
        employeeList = list.removeEmployee(removeEmp, employeeList);

        String displayModified = myApp.displayList(employeeList);
        myApp.display(displayModified);
    }

    public String readInput() {
        System.out.print("\nEnter an employee name to remove: ");

        return in.nextLine().toLowerCase();
    }

    public String displayList(ArrayList<String> employees) {
        String output;

        output = String.format("There are %d employees.\n", employees.size());

        for (String employee : employees) {
            output += String.format("%s\n", employee);
        }

        return output;
    }

    public void display(String output) {
        System.out.println(output);
    }
}
