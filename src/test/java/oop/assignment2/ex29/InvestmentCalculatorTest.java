/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentCalculatorTest {

    // Program never reaches 0 or a letter, so no need to test
    @Test
    void calculation_decimal() {
        InvestmentCalculator calc = new InvestmentCalculator();

        double expected = 48;
        double actual = calc.calculation(1.5);

        assertEquals(expected, actual);
    }

    @Test
    void calculation_int() {
        InvestmentCalculator calc = new InvestmentCalculator();

        double expected = 18;
        double actual = calc.calculation(4);

        assertEquals(expected, actual);
    }

    @Test
    void calculation_min_val() {
        InvestmentCalculator calc = new InvestmentCalculator();

        double expected = Double.POSITIVE_INFINITY;
        double actual = calc.calculation(Double.MIN_VALUE);

        assertEquals(expected, actual);
    }

    @Test
    void calculation_max_val() {

        InvestmentCalculator calc = new InvestmentCalculator();

        double expected = 4.005132945312963E-307;
        double actual = calc.calculation(Double.MAX_VALUE);

        assertEquals(expected, actual);
    }
}