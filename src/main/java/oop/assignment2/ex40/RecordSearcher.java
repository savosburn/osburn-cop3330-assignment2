/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RecordSearcher {
    private static final Scanner in = new Scanner(System.in);

    public ArrayList<HashMap<String, String>> searchRecords(ArrayList<HashMap<String, String>> employeeRecords) {
        RecordSearcher search = new RecordSearcher();

        String userSearch = search.userSearch();

        return new ArrayList<>(search.searchFirstNames(userSearch, employeeRecords));
    }

    public String userSearch() {
        System.out.print("Enter a search string: ");

        return in.nextLine();
    }

    public ArrayList<HashMap<String, String>> searchFirstNames(String userSearch, ArrayList<HashMap<String, String>> employeeRecords) {
        ArrayList<HashMap<String, String>> temp = new ArrayList<>();
        String[] tempString = {"firstNames", "lastNames"};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {

                if (employeeRecords.get(j).get(tempString[i]).contains(userSearch)) {
                    temp.add(employeeRecords.get(j));
                }
            }
        }

        return temp;
    }
}
