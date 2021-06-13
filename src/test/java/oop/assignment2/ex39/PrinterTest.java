package oop.assignment2.ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void print() {
        Printer print = new Printer();
        App myApp = new App();
        CreateEmployeeList list = new CreateEmployeeList();
        SortList sort = new SortList();

        String expected = "Name\t\t\t\t| Position\t\t\t  | Separation Date\n" +
                "--------------------|---------------------|----------------\n" +
                "Jacquelyn Jackson   | DBA                 |  \n" +
                "Jake Jacobson       | Programmer          |  \n" +
                "John Johnson        | Manager             | 2016-12-31\n" +
                "Michaela Michaelson | District Manager    | 2015-12-19\n" +
                "Sally Weber         | Web Developer       | 2015-12-18\n" +
                "Tou Xiong           | Software Engineer   | 2016-10-05\n";

        String[] sortedlist = sort.sort(list.unsortedMap());
        String actual = print.print(sortedlist, list.unsortedMap());

        assertEquals(expected, actual);
    }
}