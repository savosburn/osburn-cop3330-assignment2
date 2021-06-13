/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class OutputGeneratorTest {

    @Test
    void output_example_Jac() {
        CreateRecords records = new CreateRecords();
        RecordSearcher search  =new RecordSearcher();
        OutputGenerator generator = new OutputGenerator();

        String expected = """
                Name\t\t\t\t| Position\t\t\t  | Separation Date
                --------------------|---------------------|----------------
                Jacquelyn Jackson   | DBA                 | \s
                Jake Jacobson       | Programmer          | \s
                """;

        ArrayList<HashMap<String, String>> filtered = search.searchRecords(records.employeeRecords(), "Jac");
        String actual = generator.generateOutput(filtered);

        assertEquals(expected, actual);
    }

    @Test
    void output_no_matches_j() {
        CreateRecords records = new CreateRecords();
        RecordSearcher search  =new RecordSearcher();
        OutputGenerator generator = new OutputGenerator();

        String expected = "Nothing matches your search.";

        ArrayList<HashMap<String, String>> filtered = search.searchRecords(records.employeeRecords(), "j");
        String actual = generator.generateOutput(filtered);

        assertEquals(expected, actual);
    }

    @Test
    void output_four_matches_o() {
        CreateRecords records = new CreateRecords();
        RecordSearcher search  =new RecordSearcher();
        OutputGenerator generator = new OutputGenerator();

        String expected = """
                Name\t\t\t\t| Position\t\t\t  | Separation Date
                --------------------|---------------------|----------------
                Jacquelyn Jackson   | DBA                 | \s
                Jake Jacobson       | Programmer          | \s
                John Johnson        | Manager             | 2016-12-31
                Michaela Michaelson | District Manager    | 2015-12-19
                Tou Xiong           | Software Engineer   | 2016-10-05
                """;

        ArrayList<HashMap<String, String>> filtered = search.searchRecords(records.employeeRecords(), "o");
        String actual = generator.generateOutput(filtered);

        assertEquals(expected, actual);
    }

    @Test
    void one_name_no_match_capitalization_JOHN() {
        CreateRecords records = new CreateRecords();
        RecordSearcher search  =new RecordSearcher();
        OutputGenerator generator = new OutputGenerator();

        String expected = "Nothing matches your search.";

        ArrayList<HashMap<String, String>> filtered = search.searchRecords(records.employeeRecords(), "JOHN");
        String actual = generator.generateOutput(filtered);

        assertEquals(expected, actual);
    }

    @Test
    void one_name_one_match_sally_webber() {
        // should return nothing because program compares to first and last name separately

        CreateRecords records = new CreateRecords();
        RecordSearcher search = new RecordSearcher();
        OutputGenerator generator = new OutputGenerator();

        String expected = "Nothing matches your search.";

        ArrayList<HashMap<String, String>> filtered = search.searchRecords(records.employeeRecords(), "Sally Webber");
        String actual = generator.generateOutput(filtered);

        assertEquals(expected, actual);
    }
}
