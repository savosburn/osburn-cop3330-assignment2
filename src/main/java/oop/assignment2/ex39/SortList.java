package oop.assignment2.ex39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortList {
    // create a sorted tree map

    public String[] sort(ArrayList<HashMap<String, String>> list) {
        SortList sort = new SortList();

        String[] sortKeys = getKeys(list);

        sort.sortKeys(sortKeys);


        return sortKeys;
    }

    // Get keys
    public String[] getKeys(ArrayList<HashMap<String, String>> list) {
        HashMap<String, String> employee;

        String[][] keys = new String[6][6];
        String[] singularKeys = new String[6];


        for (int i = 0; i< 6; i++) {
            for (int j = 0; j < 6; j++) {
                employee = list.get(i);
                keys[i] = employee.keySet().toArray(new String[i]);
            }
        }

        for (int i = 0; i < 6; i++) {
            singularKeys[i] = keys[i][0];
        }

        return singularKeys;
    }

    public void sortKeys(String[] unsorted) {
        Arrays.sort(unsorted);
    }
}
