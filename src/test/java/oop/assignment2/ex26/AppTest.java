/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateOutput_example_values() {
        App myApp = new App();

        String expectedOutput = "It will take you 70 months to pay off this card.";
        String actualOutput = myApp.generateOutput(70);

        assertEquals(expectedOutput, actualOutput);
    }
}