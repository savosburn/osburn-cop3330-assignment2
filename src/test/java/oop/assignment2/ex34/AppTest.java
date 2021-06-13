/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex34;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void output_remove_john_smith() {
        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employees = list.employeeList();
        ArrayList<String> employeesModified = list.removeEmployee("john smith", employees);

        String expected = """
                There are 4 employees.
                Jackie Jackson
                Chris Jones
                Amanda Cullen
                Jeremy Goodwin
                """;

        String actual = myApp.displayList(employeesModified);

        assertEquals(expected, actual);
    }

    @Test
    void output_remove_jackie_jackson() {
        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employees = list.employeeList();

        String remove = "Jackie Jackson".toLowerCase();
        ArrayList<String> employeesModified = list.removeEmployee(remove, employees);

        String expected = """
                There are 4 employees.
                John Smith
                Chris Jones
                Amanda Cullen
                Jeremy Goodwin
                """;

        String actual = myApp.displayList(employeesModified);

        assertEquals(expected, actual);
    }

    @Test
    void output_remove_chris_jones() {
        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employees = list.employeeList();

        String remove = "Chris Jones".toLowerCase();
        ArrayList<String> employeesModified = list.removeEmployee(remove, employees);

        String expected = """
                There are 4 employees.
                John Smith
                Jackie Jackson
                Amanda Cullen
                Jeremy Goodwin
                """;

        String actual = myApp.displayList(employeesModified);

        assertEquals(expected, actual);
    }

    @Test
    void output_remove_amanda_cullen() {

        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employees = list.employeeList();

        String remove = "Amanda Cullen".toLowerCase();
        ArrayList<String> employeesModified = list.removeEmployee(remove, employees);

        String expected = """
                There are 4 employees.
                John Smith
                Jackie Jackson
                Chris Jones
                Jeremy Goodwin
                """;

        String actual = myApp.displayList(employeesModified);

        assertEquals(expected, actual);
    }

    @Test
    void output_remove_jeremy_goodwin() {

        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employees = list.employeeList();

        String remove = "Jeremy Goodwin".toLowerCase();
        ArrayList<String> employeesModified = list.removeEmployee(remove, employees);

        String expected = """
                There are 4 employees.
                John Smith
                Jackie Jackson
                Chris Jones
                Amanda Cullen
                """;

        String actual = myApp.displayList(employeesModified);

        assertEquals(expected, actual);
    }

    @Test
    void output_remove_bob_johnson() {
        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employees = list.employeeList();
        String remove = "Bob Johnson".toLowerCase();

        ArrayList<String> employeesModified = list.removeEmployee(remove, employees);

        String expected = """
                There are 5 employees.
                John Smith
                Jackie Jackson
                Chris Jones
                Amanda Cullen
                Jeremy Goodwin
                """;

        String actual = myApp.displayList(employeesModified);

        assertEquals(expected, actual);
    }

    @Test
    void output_remove_JOHN_SMITH() {
        App myApp = new App();
        EmployeeList list = new EmployeeList();

        ArrayList<String> employees = list.employeeList();

        String remove = "JOHN SMITH".toLowerCase();
        ArrayList<String> employeesModified = list.removeEmployee(remove, employees);

        String expected = """
                There are 4 employees.
                Jackie Jackson
                Chris Jones
                Amanda Cullen
                Jeremy Goodwin
                """;

        String actual = myApp.displayList(employeesModified);

        assertEquals(expected, actual);
    }
}