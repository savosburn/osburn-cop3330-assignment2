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
        ArrayList<HashMap<String, String>> containsString = new ArrayList<>();

       // containsString = search.searchFirstNames(userSearch, employeeRecords);


        containsString.addAll(search.searchFirstNames(userSearch, employeeRecords));

       // System.out.print(containsString.size());


        return containsString;
    }

    public String userSearch() {
        System.out.print("Enter a search string: ");

        return in.nextLine();
    }

    public ArrayList<HashMap<String, String>> searchFirstNames(String userSearch, ArrayList<HashMap<String, String>> employeeRecords) {
        ArrayList<HashMap<String, String>> temp = new ArrayList<>();
        String[] tempString = {"firstNames", "lastNames"};

        //System.out.print(employeeRecords.get(2).get(tempString[0]));
        //System.out.print(employeeRecords.get(1).get(tempString[0]).contains(userSearch));


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {

                if (employeeRecords.get(j).get(tempString[i]).contains(userSearch)) {
                    //System.out.print(temp.get(j).get("lastNames"));

                    HashMap<String, String> tempList = new HashMap<>();
                    tempList.put("firstNames", employeeRecords.get(j).get(tempString[i]));
                    tempList.put("lastNames", employeeRecords.get(j).get(tempString[i]));
                    tempList.put("positions", employeeRecords.get(j).get("positions"));
                    tempList.put("sepDates", employeeRecords.get(j).get("sepDates"));

                    temp.add(employeeRecords.get(j));

                }
            }
        }

        return temp;
    }
}
