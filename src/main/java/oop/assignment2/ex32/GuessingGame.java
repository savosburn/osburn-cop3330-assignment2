/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Random randomNumbers = new Random();
    private static final Scanner in = new Scanner(System.in);

    public String game() {
        GuessingGame game = new GuessingGame();

        int difficulty = game.difficulty();
        int rand = game.randomNum(difficulty);
        int numGuesses = game.userGuesses(rand);

        return game.output(numGuesses);
    }

    public int difficulty() {
        int userInput;

        System.out.print("Enter the difficulty level (1, 2, or 3): ");

        while(true) {
            try {
                userInput = Integer.parseInt(in.next());
                if (userInput < 1 || userInput > 3) {
                    System.out.println("Invalid level; ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. ");
            }
        }

        return userInput;
    }

    public int randomNum(int difficulty) {
        int randomVal = 0;

        switch (difficulty) {
            case 1 -> randomVal = 1 + randomNumbers.nextInt(10);
            case 2 -> randomVal = 1 + randomNumbers.nextInt(100);
            case 3 -> randomVal = 1 + randomNumbers.nextInt(1000);
        }

       return randomVal;
    }

    public int userGuesses(int rand) {
        int numGuesses = 0;
        int userInput;

        System.out.print("I have my number. What's your guess? ");

        while(true) {
            try {
                userInput = Integer.parseInt(in.next());

                if (userInput < rand) {
                    System.out.print("Too low. Guess again: ");
                    numGuesses++;
                }
                else if (userInput > rand) {
                    System.out.print("Too high. Guess again: ");
                    numGuesses++;
                }
                else {
                    numGuesses++;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. ");
                numGuesses++;
            }
        }

        return numGuesses;
    }

    public String output(int numGuesses){
        return String.format("You got it in %d guesses!\n\n", numGuesses);
    }

    public String playAgain() {
        System.out.print("Do you wish to play again (Y/N)? ");

        String userInput;
        while(true) {
            try {
                userInput = in.next().toLowerCase();

                if (!userInput.equals("y") && !userInput.equals("n")) {
                    System.out.print("Sorry. That's not a valid input. Try again: ");
                }
                else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. Try again: ");
            }
        }

        return userInput;
    }
}
