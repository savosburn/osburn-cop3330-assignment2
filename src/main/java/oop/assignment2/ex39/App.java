/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex39;

/*
When you’re looking at results, you’ll want to be able to sort them so you
 can find what you’re looking for quickly or do some quick visual comparisons.

Given the following data set, create a program that sorts all employees by
last name and prints them to the screen in a tabular format.

First Name	Last Name	Position	     Separation Date
John	    Johnson	    Manager	            2016-12-31
Tou     	Xiong	    Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	    Jacobson	Programmer
Jacquelyn	Jackson	    DBA
Sally	    Webber	    Web Developer   	2015-12-18


Example Output
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05
Constraint
Store the data using a list of maps.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        App myApp = new App();
        CreateEmployeeList list = new CreateEmployeeList();
        SortList sort = new SortList();
        Printer print = new Printer();
        ArrayList<HashMap<String, String>> unsortedList = new ArrayList<>();

        unsortedList = list.unsortedMap();

        String[] sortedList = sort.sort(unsortedList); // good

        String output = print.print(sortedList, unsortedList);

        myApp.display(output);


    }

    public void display(String output) {
        System.out.println(output);
    }
}
