/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex33;

import java.util.Random;

public class MagicEightBall {
    Random randomNumbers = new Random();

    public String eightBall() {
        MagicEightBall eightBall = new MagicEightBall();

        return eightBall.randomAnswers(eightBall.randChoice());
    }

    public int randChoice() {
        return (1 + randomNumbers.nextInt(4));
    }

    public String randomAnswers(int choice) {
        switch (choice) {
            case 1:
                return "Yes";
            case 2:
                return "No";
            case 3:
                return "Maybe";
            case 4:
                return "Ask again later.";
        }
        return null;
    }
}
