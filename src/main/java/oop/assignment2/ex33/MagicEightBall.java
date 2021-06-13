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
        return switch (choice) {
            case 1 -> "Yes";
            case 2 -> "No";
            case 3 -> "Maybe";
            case 4 -> "Ask again later.";
            default -> null;
        };
    }
}
