/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Contest {
    private static final Scanner in = new Scanner(System.in);
    Random randomNumbers = new Random();

    public ArrayList<String> addContestants(ArrayList<String> contestants) {

        String input = null;
        while (true) {
            System.out.print("Enter a name: ");
            try {
                input = in.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                contestants.add(input);

            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. ");
            }
        }
        return contestants;
    }

    public int chooseWinner(int numContestants) {
        return randomNumbers.nextInt(numContestants);
    }

    public String winner(ArrayList<String> contestants, int winner) {
        return String.format("The winner is... %s", contestants.get(winner));
    }
}
