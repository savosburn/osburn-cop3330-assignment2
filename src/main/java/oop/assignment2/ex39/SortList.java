package oop.assignment2.ex39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortList {
    // create a sorted tree map

    public String[] sort(ArrayList<HashMap<String, String>> list) {
        SortList sort = new SortList();

        String[] sortKeys = getKeys(list);

        String[] alphabeticLNames = lastNamesAlphabetic(sortKeys, list);

        // testing
        for (int i = 0;i < 6; i++)
            System.out.print(" " + alphabeticLNames[i] + " ");

        return alphabeticLNames;
    }

    public String[] lastNamesAlphabetic(String[] sortKeys,ArrayList<HashMap<String, String>> list ) {
        String[] lastNames = new String[6];

        for (int i = 0;i < 6; i++) {
            lastNames[i] = list.get(i).get("lastNames");
        }

        Arrays.sort(lastNames);

        return lastNames;
    }



    // Get keys
    public String[] getKeys(ArrayList<HashMap<String, String>> list) {

        HashMap<String, String> oneEmployee = new HashMap<String, String>();
        oneEmployee = list.get(0);

        String[] keys;


   

        keys = oneEmployee.keySet().toArray(new String[0]);



        return keys;
    }


        // Declare hash map

        // loop through every hash map and get all the keys: one map has 4 maps: firstname, lastname, positions, date
        //                                                                       6          6           6       6

        // There are 6 in array list and 4 to loop through

        // get to key last name
        // switch those to an array
            // sort the last names
            // make sure the rest is sorted in the same way

        // return array of strings



        /*
        HashMap<String, String> employee;

        String[][] keys = new String[6][6];
        String[] singularKeys = new String[6];


        for (int i = 0; i< 6; i++) {

            for (int j = 0; j < 6; j++) {
                employee = list.get(i);
                keys[i] = employee.keySet().toArray(new String[i]);
                keys[j] = employee.values().toArray(new String[j]);

            }
        }




        for (int i = 0; i < 4; i++) {
            singularKeys[i] = keys[0][i];
        }

        return singularKeys;
    }

    public void sortKeys(String[] unsorted) {
        Arrays.sort(unsorted);
    }*/
}
