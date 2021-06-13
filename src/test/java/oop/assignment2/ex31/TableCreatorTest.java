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

        String expected = """
                Intensity    | Rate
                -------------|--------
                55%          | 138 bpm
                60%          | 145 bpm
                65%          | 151 bpm
                70%          | 158 bpm
                75%          | 165 bpm
                80%          | 171 bpm
                85%          | 178 bpm
                90%          | 185 bpm
                95%          | 191 bpm
                """;

        String actual = table.createTable(65, 22);

        assertEquals(expected, actual);
    }

    @Test
    void createTable_different_set_of_values() {
        TableCreator table = new TableCreator();

        String expected = """
                Intensity    | Rate
                -------------|--------
                55%          | 130 bpm
                60%          | 133 bpm
                65%          | 136 bpm
                70%          | 139 bpm
                75%          | 141 bpm
                80%          | 144 bpm
                85%          | 147 bpm
                90%          | 150 bpm
                95%          | 152 bpm
                """;

        String actual = table.createTable(100, 65);

        assertEquals(expected, actual);
    }
}