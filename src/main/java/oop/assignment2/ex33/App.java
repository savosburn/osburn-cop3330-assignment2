/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex33;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        MagicEightBall eightBall = new MagicEightBall();

        myApp.userQuestion();

        String output = eightBall.eightBall();
        myApp.print(output);
    }

    public void userQuestion() {
        System.out.print("What's your question? ");
        in.nextLine();
    }

    public void print(String output) {
        System.out.println(output);
    }
}
