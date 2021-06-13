/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsDataTest {

    @Test
    void generateOutput_original_example() {
        App myApp = new App();
        StatisticsData sd = new StatisticsData();

        ArrayList<Double> list = new ArrayList<>();
        list.add(100.0);
        list.add(200.0);
        list.add(1000.0);
        list.add(300.0);

        String expected = "\nNumbers: 100, 200, 1000, 300\n" +
                "The average is 400.0\n" +
                "The minimum is 100\n" +
                "The maximum is 1000\n" +
                "The standard deviation is 353.55\n";

        String actual = myApp.printResponseTimes(list) + sd.generateOutput(list);

        assertEquals(expected, actual);
    }

    @Test
    void generateOutput_test_zeros() {
        App myApp = new App();
        StatisticsData sd = new StatisticsData();

        ArrayList<Double> list = new ArrayList<>();
        list.add(0.0);
        list.add(0.0);
        list.add(0.0);
        list.add(0.0);

        String expected = "\nNumbers: 0, 0, 0, 0\n" +
                "The average is 0.0\n" +
                "The minimum is 0\n" +
                "The maximum is 0\n" +
                "The standard deviation is 0.00\n";

        String actual = myApp.printResponseTimes(list) + sd.generateOutput(list);

        assertEquals(expected, actual);
    }

}