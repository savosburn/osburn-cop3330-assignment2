/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex38;

import java.util.ArrayList;

public class FilterString {

    public ArrayList<Integer> evenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> evens = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        return evens;
    }

    public ArrayList<Integer> allNumbers(String input) {
        ArrayList<Integer> allNumbers = new ArrayList<>();

        ArrayList<String> nums = convertInputToArray(input);

        for (String num : nums) {

            allNumbers.add(Integer.parseInt(num));
        }

        return allNumbers;
    }

    public ArrayList<String> convertInputToArray(String input) {
        ArrayList<String> inputArray = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (!(Character.toString(input.charAt(i)).equals(" "))) {
                inputArray.add(Character.toString(input.charAt(i)));
            }
        }

        return inputArray;
    }
}
