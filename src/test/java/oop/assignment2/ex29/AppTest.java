/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateOutput_decimal() {
        App myApp = new App();

        String expected = "It will take 4.05 years to double your initial investment.";
        String actual = myApp.generateOutput(4.05);

        assertEquals(expected, actual);
    }

    @Test
    void generateOutput_whole_num() {

        App myApp = new App();

        String expected = "It will take 18 years to double your initial investment.";
        String actual = myApp.generateOutput(18);

        assertEquals(expected, actual);
    }
}