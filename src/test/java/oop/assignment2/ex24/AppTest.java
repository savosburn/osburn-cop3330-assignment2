/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void generate_output_not_anagrams() {
        App myApp = new App();

        String expected = "\"star\" and \"twirl\" are not anagrams.";
        String actual = myApp.generateOutput(false, "star", "twirl");

        assertEquals(expected, actual);

    }

    @Test
    public void generate_output_not_anagrams_capitalization() {
        App myApp = new App();

        String expected = "\"sTar\" and \"tWIrl\" are not anagrams.";
        String actual = myApp.generateOutput(false, "sTar", "tWIrl");

        assertEquals(expected, actual);

    }

    @Test
    public void generate_output_anagrams() {
        App myApp = new App();

        String expected = "\"star\" and \"tars\" are anagrams.";
        String actual = myApp.generateOutput(true, "star", "tars");

        assertEquals(expected, actual);
    }

    @Test
    public void generate_output_anagrams_capitalization() {
        App myApp = new App();

        String expected = "\"sTaR\" and \"TaRs\" are anagrams.";
        String actual = myApp.generateOutput(true, "sTaR", "TaRs");

        assertEquals(expected, actual);
    }
}