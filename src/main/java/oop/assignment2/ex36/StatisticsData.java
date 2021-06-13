/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex36;

import java.util.ArrayList;

public class StatisticsData {

    public String generateOutput(ArrayList<Double> responseTimes) {
        StatisticsData sd = new StatisticsData();

        double average = sd.average(responseTimes);
        double max = sd.max(responseTimes);
        double min = sd.min(responseTimes);
        double std = sd.std(responseTimes, average);

        return String.format("The average is %.01f\n", average) +
                String.format("The minimum is %.0f\n", min) +
                String.format("The maximum is %.0f\n", max) +
                String.format("The standard deviation is %.02f\n", std);
    }

    public double average(ArrayList <Double> responseTimes) {
        int total = 0;

        for (Double responseTime : responseTimes) {
            total += responseTime;
        }

        return (double) total / responseTimes.size();
    }

    public double max(ArrayList<Double> responseTimes) {
        double max = Double.MIN_VALUE;

        for (Double responseTime : responseTimes) {
            if (responseTime > max) {
                max = responseTime;
            }
        }

        return max;
    }

    public double min(ArrayList<Double> responseTimes) {
        double min = Double.MAX_VALUE;

        for (Double responseTime : responseTimes) {
            if (responseTime < min) {
                min = responseTime;
            }
        }

        return min;
    }

    public double std(ArrayList<Double> responseTimes, double average) {
        double num = 0;

        for (Double responseTime : responseTimes) {
            num += Math.pow((responseTime - average), 2);
        }

        return Math.sqrt(num / responseTimes.size());
    }
}
