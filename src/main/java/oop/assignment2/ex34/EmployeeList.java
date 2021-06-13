/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex34;

import java.util.ArrayList;

public class EmployeeList {

    public ArrayList<String> employeeList() {
        ArrayList<String> empList = new ArrayList<>();

        empList.add("John Smith");
        empList.add("Jackie Jackson");
        empList.add("Chris Jones");
        empList.add("Amanda Cullen");
        empList.add("Jeremy Goodwin");

        return empList;
    }

    public ArrayList<String> removeEmployee(String employee, ArrayList<String> employees) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).toLowerCase().equals(employee)) {
                employees.remove(i);
                break;
            }
        }

        return employees;
    }
}
