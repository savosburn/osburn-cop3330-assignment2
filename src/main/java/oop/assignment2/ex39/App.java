/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex39;

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

        ArrayList<HashMap<String, String>> unsortedList;

        unsortedList = list.unsortedMap();

        String[] sortedList = sort.sort(unsortedList);

        String output = print.print(sortedList, unsortedList);
        myApp.display(output);
    }

    public void display(String output) {
        System.out.println(output);
    }
}
