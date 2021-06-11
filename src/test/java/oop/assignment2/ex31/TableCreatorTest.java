/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableCreatorTest {

    @Test
    void createTable() {
        TableCreator table = new TableCreator();

        String expected = "Intensity    | Rate\n" +
                "-------------|--------\n" +
                "55%          | 138 bpm\n" +
                "60%          | 145 bpm\n" +
                "65%          | 151 bpm\n" +
                "70%          | 158 bpm\n" +
                "75%          | 165 bpm\n" +
                "80%          | 171 bpm\n" +
                "85%          | 178 bpm\n" +
                "90%          | 185 bpm\n" +
                "95%          | 191 bpm\n";

        String actual = table.createTable(65, 22);

        assertEquals(expected, actual);
    }
}