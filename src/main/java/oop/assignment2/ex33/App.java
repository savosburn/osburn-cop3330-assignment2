/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex33;

/*
Arrays are great for storing possible responses from a program.
If you combine that with a random number generator, you can pick a random entry from this list,
 which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either
"Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        MagicEightBall eightBall = new MagicEightBall();

        // Read in question
        myApp.userQuestion();

        String output = eightBall.eightBall();
        myApp.print(output);
        // get random answer
        // output
    }

    public void userQuestion() {
        System.out.print("What's your question? ");
        in.nextLine();
    }

    public void print(String output) {
        System.out.println(output);
    }


}
