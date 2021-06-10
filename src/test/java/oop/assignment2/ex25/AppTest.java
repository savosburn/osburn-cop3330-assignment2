/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateOutput_very_weak() {
        App myApp = new App();

        String expectedOutput = "The password '12345' is a very weak password.";
        String actualOutput = myApp.generateOutput(0, "12345");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void generateOutput_weak() {
        App myApp = new App();

        String expectedOutput = "The password 'abcdef' is a weak password.";
        String actualOutput = myApp.generateOutput(1, "abcdef");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void generateOutput_strong() {
        App myApp = new App();

        String expectedOutput = "The password 'abc123xyz' is a strong password.";
        String actualOutput = myApp.generateOutput(2, "abc123xyz");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void generateOutput_very_strong() {
        App myApp = new App();

        String expectedOutput = "The password '1337h@xor!' is a very strong password.";
        String actualOutput = myApp.generateOutput(3, "1337h@xor!");

        assertEquals(expectedOutput, actualOutput);
    }
}