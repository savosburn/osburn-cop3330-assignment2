/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex36;

/*
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities.
For example, the standard deviation helps you determine which values are outliers and which values are
 within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done

Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        StatisticsData sd = new StatisticsData();
        ArrayList<Double> responseTimes = new ArrayList<Double>();

         responseTimes = myApp.readInput(responseTimes);

        myApp.printResponseTimes(responseTimes);

        String output = sd.generateOutput(responseTimes);
        myApp.output(output);
    }

    public ArrayList<Double> readInput(ArrayList<Double> items) {
        String input = null;

        while (true) {
            System.out.print("Enter a number: ");
            try {
                input = (in.next().toLowerCase());
                if (input.equals("done")) {
                    break;
                }
                items.add(Double.parseDouble(input));

            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. ");
            }
        }

        return items;
    }

    public void printResponseTimes(ArrayList<Double> times){
        System.out.print("\nNumbers: ");

        for (int i = 0; i < times.size(); i++) {

            if (i == times.size() - 1){
                System.out.printf("%.0f\n", times.get(i));
                break;
            }

            System.out.printf("%.0f, ", times.get(i));

        }
    }

    public void output(String output) {
        System.out.print(output);
    }
}
