/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

// FIGURE OUT HOW TO DO TEST CASES

package oop.assignment2.ex32;

public class App {
    public static void main(String[] args) {
        App myApp = new App();
        GuessingGame game = new GuessingGame();

        System.out.print("Let's play Guess the Number!\n\n");

        String playAgain = "y";
        while (playAgain.equals("y")) {

            String output = game.game();
            myApp.print(output);

            playAgain = game.playAgain();
        }
    }

    public void print(String output) {
        System.out.print(output);
    }
}
