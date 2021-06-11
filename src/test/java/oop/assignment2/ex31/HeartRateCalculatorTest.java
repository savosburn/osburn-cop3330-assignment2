package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {

    @Test
    void calculateRate_55() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 138;
        double actual = Math.round(calc.calculateRate(65, 22, 55));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_60() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 145;
        double actual = Math.round(calc.calculateRate(65, 22, 60));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_65() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 151;
        int actual =(int) Math.round(calc.calculateRate(65, 22, 65));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_70() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 158;
        double actual = Math.round(calc.calculateRate(65, 22, 70));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_75() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 165;
        double actual = Math.round(calc.calculateRate(65, 22, 75));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_80() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 171;
        double actual = Math.round(calc.calculateRate(65, 22, 80));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_85() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 178;
        double actual = Math.round(calc.calculateRate(65, 22, 85));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_90() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 185;
        double actual = Math.round(calc.calculateRate(65, 22, 90));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_95() {
        HeartRateCalculator calc = new HeartRateCalculator();

        // Accounts for rounding which occurs in create table
        double expected = 191;
        double actual = Math.round(calc.calculateRate(65, 22, 95));

        assertEquals(expected, actual);
    }
}