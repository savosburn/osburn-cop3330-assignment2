/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

// FIGURE OUT HOW TO DO TEST CASES

package oop.assignment2.ex32;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {
    @Test
    void testOutput() {

        GuessingGame game = new GuessingGame();

        String expected = "You got it in 10 guesses!\n\n";
        String actual =game.output(10);

        assertEquals(expected, actual);
    }
}