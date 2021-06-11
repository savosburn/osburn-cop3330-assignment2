/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex34;

public class EmployeeList {
    public String[] empList() {
        return new String[]{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
    }

    public String[] modifyList(String[] list, String name){
        String[] modifiedList = new String[list.length - 1];
        for (int i = 0, j = 0; i < list.length; i++) {
            if (!list[i].toLowerCase().equals(name)) {
                modifiedList[j++] = list[i];
            }
        }

        return modifiedList;

    }


}
