/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex31;

import java.text.NumberFormat;

public class TableCreator {
    public String createTable(double restingPulse, double age) {
        HeartRateCalculator calc = new HeartRateCalculator();
        TableCreator tableCreator = new TableCreator();

        String table =  ("Intensity    | Rate\n" + "-------------|--------\n");

        for (int i = 55; i <= 95; i += 5){

            int beatsPerMin = (int) Math.round((calc.calculateRate(restingPulse, age, i)));
            String bpm = Integer.toString(beatsPerMin);
            String percentage = tableCreator.getPercentage(i);

            table += String.format("%s          | %s bpm\n", percentage, bpm);
            // table.append(percentage).append("\t\t\t |").append(" ").append(bpm).append(" bpm\n");
        }

        return table.toString();
    }

    public String getPercentage(int percentage) {
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        return percentFormat.format((double) percentage / 100);
    }

}
