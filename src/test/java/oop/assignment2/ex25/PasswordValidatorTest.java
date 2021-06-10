/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// The password '12345' is a very weak password.
//The password 'abcdef' is a weak password.
//The password 'abc123xyz' is a strong password.
//The password '1337h@xor!' is a very strong password.

class PasswordValidatorTest {

    @Test
    void passwordValidator_only_nums_less_than_eight_very_weak() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 0;
        int actual = validator.passwordValidator("12345");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_only_letters_less_than_eight_weak() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 1;
        int actual = validator.passwordValidator("abcdef");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_only_specialChars_less_than_eight_weak() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 1;
        int actual = validator.passwordValidator("abc%ef");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_letters_and_nums_less_than_eight_weak() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 1;
        int actual = validator.passwordValidator("abc34ef");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_letters_nums_and_specialChars_less_than_eight_weak() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 1;
        int actual = validator.passwordValidator("abc!4ef");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_only_nums_eight_strong() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 2;
        int actual = validator.passwordValidator("123456789");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_only_letters_eight_strong() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 3;
        int actual = validator.passwordValidator("abcdefghijk");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_only_specialChar_eight_strong() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 3;
        int actual = validator.passwordValidator("%!_%$@!%*?");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_letters_and_nums_eight_strong() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 2;
        int actual = validator.passwordValidator("ababc123xyzcd");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_letters_nums_and_specialChars_eight_very_strong() {
        PasswordValidator validator = new PasswordValidator();

        int expected = 3;
        int actual = validator.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);
    }
}