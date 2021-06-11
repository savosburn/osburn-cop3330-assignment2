/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex31;

public class HeartRateCalculator {
    public double calculateRate(double restingPulse, double age, double intensity) {

        return ((((220 - age) - restingPulse) * (intensity / 100)) + restingPulse);

        // (((220 − age) − restingHR) × intensity) + restingHR
    }
}
