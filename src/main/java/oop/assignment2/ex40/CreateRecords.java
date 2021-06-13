/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */


package oop.assignment2.ex40;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateRecords {

    public ArrayList<HashMap<String, String>> employeeRecords() {

        CreateRecords record = new CreateRecords();
        ArrayList<HashMap<String, String>> empList = new ArrayList<>();

        String[] fNames = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
        String[] lNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String[] positions = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
        String[] sepDates = {"2016-12-31", "2016-10-05", "2015-12-19", null, null, "2015-12-18"};

        for (int i = 0; i < 6; i++) {
            empList.add(record.addMap(i, fNames, lNames, positions, sepDates));
        }

        return record.alphabetize(empList);
    }

    public ArrayList<HashMap<String, String>> alphabetize(ArrayList<HashMap<String, String>> unsorted) {
        String[] lastNames = new String[unsorted.size()];

        for (int i = 0; i < 6; i++) {
            lastNames[i] = unsorted.get(i).get("lastNames");
        }

        String key;
        int j;
        for (int i = 1; i < 6; i++) {
            key = lastNames[i];
            j = i - 1;

            while (j >= 0 && lastNames[j].compareTo(key) > 0) {
                lastNames[j + 1] = lastNames[j];
                j = j-1;
            }
            lastNames[j + 1] = key;
        }

        return sorter(unsorted, lastNames);
    }

    public ArrayList<HashMap<String, String>> sorter(ArrayList<HashMap<String, String>> unsorted, String[] alphabetized) {
        ArrayList<HashMap<String, String>> sort = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (unsorted.get(j).get("lastNames").equals(alphabetized[i])) {
                    sort.add(unsorted.get(j));
                }
            }
        }

        return sort;
    }

    public HashMap<String, String> addMap(int k, String[] fNames, String[] lNames, String[] positions, String[]
            sepDates) {
        HashMap<String, String> employee = new HashMap<>();

        employee.put("firstNames", fNames[k]);
        employee.put("lastNames", lNames[k]);
        employee.put("positions", positions[k]);
        employee.put("sepDates", sepDates[k]);

        return employee;
    }
}
