/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex38;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilterStringTest {

    @Test
    void evenNumbers_oddAmount() {
        FilterString filter = new FilterString();
        App myApp = new App();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        ArrayList<Integer> evens = filter.evenNumbers(nums);

        String expected = "The even numbers are 0 2 4 ";
        String actual = myApp.generateOutput(evens);

        assertEquals(expected, actual);
    }

    @Test
    void evenNumbers_evenAmount() {
        FilterString filter = new FilterString();
        App myApp = new App();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        ArrayList<Integer> evens = filter.evenNumbers(nums);

        String expected = "The even numbers are 2 4 ";
        String actual = myApp.generateOutput(evens);

        assertEquals(expected, actual);
    }

    @Test
    void evenNumbers_none() {
        FilterString filter = new FilterString();
        App myApp = new App();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(5);
        nums.add(3);
        nums.add(7);

        ArrayList<Integer> evens = filter.evenNumbers(nums);

        String expected = "There are no even numbers.";
        String actual = myApp.generateOutput(evens);

        assertEquals(expected, actual);
    }

    @Test
    void evenNumbers_allEven() {
        FilterString filter = new FilterString();
        App myApp = new App();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(0);
        nums.add(6);
        nums.add(2);
        nums.add(18);
        nums.add(4);

        ArrayList<Integer> evens = filter.evenNumbers(nums);

        String expected = "The even numbers are 0 6 2 18 4 ";
        String actual = myApp.generateOutput(evens);

        assertEquals(expected, actual);
    }
}