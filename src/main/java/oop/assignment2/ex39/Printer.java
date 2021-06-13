/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex39;

import java.util.ArrayList;
import java.util.HashMap;

public class Printer {
    public static int MAX = 6;
    public static int SPACES = 19;

    public String print(String[] sortedList, ArrayList<HashMap<String, String>> employees) {
        Printer printing = new Printer();

        String headings = printing.setUpTable();
        String output = printing.createTable(sortedList, employees);

        return headings + output;
    }

    public String setUpTable() {
        String str1 = "Name\t\t\t\t| Position\t\t\t  | Separation Date\n";
        String str2 = "--------------------|---------------------|----------------\n";

        return str1 + str2;
    }

    public String createTable(String[] alphabeticNames, ArrayList<HashMap<String, String>> list) {
        String output = null;

        for (int i = 0; i < MAX; i++) {
            String str1 = null;

            for (int j = 0; j < MAX; j++) {
                HashMap<String, String> map = list.get(j);
                if (list.get(j).get("lastNames").equals(alphabeticNames[i])) {

                    str1 = checkNull(list, j, "firstNames") + " " + checkNull(list, j, "lastNames") +
                            spaces(list, j, "lastNames") + checkNull(list, j, "positions") +
                            spaces(list, j, "positions") + checkNull(list, j, "sepDates");
                }
            }

            if (output == null) {
                output = str1 + "\n";
            } else
                output += str1 + "\n";
        }

        return output;
    }

    public String checkNull(ArrayList<HashMap<String, String>> list, int k, String key) {
        if (list.get(k).get(key) == null) {
            return " ";
        }
        else {
            return list.get(k).get(key);
        }
    }

    public String spaces(ArrayList<HashMap<String, String>> list, int k, String key) {

        int count;

        if (key.equals("lastNames")) {
            count = list.get(k).get("firstNames").length() + list.get(k).get(key).length() + 1;
        }
        else {
            count = list.get(k).get(key).length();
        }

        String string = " ";

        while (count < SPACES) {
            string += " ";
            count++;
        }

        if (!key.equals("sepDates")) {
            string += "| ";
        }

        return string;
    }
}
