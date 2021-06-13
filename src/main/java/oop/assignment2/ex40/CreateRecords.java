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

        return empList;
    }


    public HashMap<String, String> addMap(int k, String[] fNames, String[] lNames, String[] positions, String[] sepDates) {
        HashMap<String, String> employee = new HashMap<>();

        employee.put("firstNames", fNames[k]);
        employee.put("lastNames", lNames[k]);
        employee.put("positions", positions[k]);
        employee.put("sepDates", sepDates[k]);

        return employee;
    }
}
