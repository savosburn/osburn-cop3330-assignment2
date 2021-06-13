/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void print() {
        Printer print = new Printer();
        CreateEmployeeList list = new CreateEmployeeList();
        SortList sort = new SortList();

        String expected = """
                Name\t\t\t\t| Position\t\t\t  | Separation Date
                --------------------|---------------------|----------------
                Jacquelyn Jackson   | DBA                 | \s
                Jake Jacobson       | Programmer          | \s
                John Johnson        | Manager             | 2016-12-31
                Michaela Michaelson | District Manager    | 2015-12-19
                Sally Weber         | Web Developer       | 2015-12-18
                Tou Xiong           | Software Engineer   | 2016-10-05
                """;

        String[] sortedlist = sort.sort(list.unsortedMap());
        String actual = print.print(sortedlist, list.unsortedMap());

        assertEquals(expected, actual);
    }
}