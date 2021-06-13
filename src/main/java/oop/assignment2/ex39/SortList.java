/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortList {

    public String[] sort(ArrayList<HashMap<String, String>> list) {
        SortList sort = new SortList();

        return sort.lastNamesAlphabetic(list);
    }

    public String[] lastNamesAlphabetic(ArrayList<HashMap<String, String>> list ) {
        String[] lastNames = new String[6];

        for (int i = 0;i < 6; i++) {
            lastNames[i] = list.get(i).get("lastNames");
        }

        Arrays.sort(lastNames);

        return lastNames;
    }
}
