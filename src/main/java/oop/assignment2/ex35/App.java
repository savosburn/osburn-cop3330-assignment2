/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex35;

/*
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time.
You may need to find another data structure, like an ArrayList.
 */

import java.util.ArrayList;

public class App {


    public static void main(String[] args) {
        App myApp = new App();
        Contest contest = new Contest();
        ArrayList<String> contestants = new ArrayList<String>();

        ArrayList<String> addedContestants = contest.addContestants(contestants);

        int winner = contest.chooseWinner(addedContestants.size());
        String output = contest.winner(addedContestants, winner);
        myApp.print(output);
    }

    public void print(String output) {
        System.out.println(output);
    }


}
