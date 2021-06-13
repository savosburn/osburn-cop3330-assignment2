/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    void invalidFirstNameFunction_valid_name() {
        Validation validator = new Validation();

        String actualOutput = validator.invalidName("James", "first");

        assertNull(actualOutput);
    }

    @Test
    void invalidFirstNameFunction_no_name() {
        Validation validator = new Validation();

        String expectedOutput = """
                The first name must be at least 2 characters long.
                The first name must be filled in.
                """;
        String actualOutput = validator.invalidName("", "first");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void invalidFirstNameFunction_too_short_name() {
        Validation validator = new Validation();

        String expectedOutput = "The first name must be at least 2 characters long.\n";
        String actualOutput = validator.invalidName("J", "first");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void invalidLastNameFunction_valid_name() {
        Validation validator = new Validation();

        String actual = validator.invalidName("Johnson", "last");

        assertNull(actual);
    }

    @Test
    void invalidLastNameFunction_no_name() {
        Validation validator = new Validation();

        String expectedOutput = """
                The last name must be at least 2 characters long.
                The last name must be filled in.
                """;
        String actualOutput = validator.invalidName("", "last");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void invalidLastNameFunction_too_short_name() {
        Validation validator = new Validation();

        String expectedOutput = "The last name must be at least 2 characters long.\n";
        String actualOutput = validator.invalidName("J", "last");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void invalidZipFunction_valid_zip() {
        Validation validator = new Validation();

        String actualOutput = validator.invalidZip("55555");

        assertNull(actualOutput);
    }

    @Test
    void invalidZipFunction_invalid_letters() {
        Validation validator = new Validation();

        String expected = "The zipcode must be a 5 digit number.\n";

        String actual = validator.invalidZip("abcde");

        assertEquals(expected, actual);
    }

    @Test
    void invalidZipFunction_invalid_letters_and_too_short() {
        Validation validator = new Validation();

        String expected = "The zipcode must be a 5 digit number.\n";

        String actual = validator.invalidZip("abc");

        assertEquals(expected, actual);
    }

    @Test
    void invalidZipFunction_invalid_too_short() {
        Validation validator = new Validation();

        String expected = "The zipcode must be a 5 digit number.\n";

        String actual = validator.invalidZip("123");

        assertEquals(expected, actual);
    }

    @Test
    void invalidZipFunction_invalid_no_zip() {
        Validation validator = new Validation();

        String expected = """
                The zipcode must be a 5 digit number.
                The zipcode must be filled in.
                """;

        String actual = validator.invalidZip("");

        assertEquals(expected, actual);
    }

    @Test
    void invalidIdFunction_valid() {
        Validation validator = new Validation();

        String actual = validator.invalidId("TK-4321");

        assertNull(actual);
    }

    @Test
    void invalidIdFunction_numbers_at_beginning_invalid() {
        Validation validator = new Validation();

        String expected = "The employee ID must be in the format of AA-1234.\n";
        String actual = validator.invalidId("12-9087");

        assertEquals(expected, actual);
    }

    @Test
    void invalidIdFunction_numbers_not_a_dash() {
        Validation validator = new Validation();

        String expected = "The employee ID must be in the format of AA-1234.\n";
        String actual = validator.invalidId("TK/9087");

        assertEquals(expected, actual);
    }

    @Test
    void invalidIdFunction_numbers_letters_at_end() {
        Validation validator = new Validation();

        String expected = "The employee ID must be in the format of AA-1234.\n";
        String actual = validator.invalidId("TK-JHGK");

        assertEquals(expected, actual);
    }

    @Test
    void invalidIdFunction_random_combination() {
        Validation validator = new Validation();

        String expected = "The employee ID must be in the format of AA-1234.\n";
        String actual = validator.invalidId("78/Fgh!");

        assertEquals(expected, actual);
    }

    @Test
    void invalidIdFunction_empty() {
        Validation validator = new Validation();

        String expected = "The employee ID must be in the format of AA-1234.\n" +
                "The employee ID must be filled in.";
        String actual = validator.invalidId("");

        assertEquals(expected, actual);
    }

    @Test
    void validate_all_correct() {
        Validation validator = new Validation();

        String expected = "There were no errors found.";
        String actual = validator.concatenation(null, null, null, null);

        assertEquals(expected, actual);
    }

}