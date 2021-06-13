/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex40;

import java.util.ArrayList;
import java.util.HashMap;

public class RecordSearcher {

    public ArrayList<HashMap<String, String>> searchRecords(ArrayList<HashMap<String, String>> employeeRecords, String userSearch) {
        RecordSearcher search = new RecordSearcher();


        return new ArrayList<>(search.searchNames(userSearch, employeeRecords));
    }

    public ArrayList<HashMap<String, String>> searchNames(String userSearch, ArrayList<HashMap<String, String>> employeeRecords) {
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
