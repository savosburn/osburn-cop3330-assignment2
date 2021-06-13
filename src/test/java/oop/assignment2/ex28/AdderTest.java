/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    public void addNumbers_all_zero() {
        Adder add = new Adder();

        double[] input = {0, 0, 0, 0, 0};

        double expected = 0.0;
        double actual = add.addNumbers(input);

        assertEquals(expected, actual);
    }

    @Test
    public void addNumbers_normal_test() {
        Adder add = new Adder();

        double[] input = {1, 2, 3, 4, 5};

        double expected = 15;
        double actual = add.addNumbers(input);

        assertEquals(expected, actual);
    }

    @Test
    public void addNumbers_all_MINVAL() {
        Adder add = new Adder();

        double[] input = {Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};

        double expected = 2.5E-323;
        double actual = add.addNumbers(input);

        assertEquals(expected, actual);
    }

    @Test
    public void addNumbers_all_MAXVAL() {
        Adder add = new Adder();

        double[] input = {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE};

        double expected = Double.POSITIVE_INFINITY;
        double actual = add.addNumbers(input);

        assertEquals(expected, actual);
    }

    @Test
    public void addNumbers_more_numbers() {
        Adder add = new Adder();

        double[] input = {5, 17, 8, 23, 6};

        double expected = 59;
        double actual = add.addNumbers(input);

        assertEquals(expected, actual);
    }
}