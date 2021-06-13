/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {

    @Test
    void calculateRate_55_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 138;
        double actual = Math.round(calc.calculateRate(65, 22, 55));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_60_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 145;
        double actual = Math.round(calc.calculateRate(65, 22, 60));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_65_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 151;
        int actual =(int) Math.round(calc.calculateRate(65, 22, 65));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_70_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 158;
        double actual = Math.round(calc.calculateRate(65, 22, 70));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_75_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 165;
        double actual = Math.round(calc.calculateRate(65, 22, 75));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_80_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 171;
        double actual = Math.round(calc.calculateRate(65, 22, 80));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_85_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 178;
        double actual = Math.round(calc.calculateRate(65, 22, 85));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_90_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 185;
        double actual = Math.round(calc.calculateRate(65, 22, 90));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_95_age_22_pulse_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 191;
        double actual = Math.round(calc.calculateRate(65, 22, 95));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_55_age_0_pulse_0() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 121;
        double actual = Math.round(calc.calculateRate(0, 0, 55));

        assertEquals(expected, actual, 0.0000000001);
    }

    @Test
    void calculateRate_55_age_MINVAL_pulse_MINVAL() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 121;
        double actual = Math.round(calc.calculateRate(Double.MIN_VALUE, Double.MIN_VALUE, 55));

        assertEquals(expected, actual, 0.0000000001);
    }

}