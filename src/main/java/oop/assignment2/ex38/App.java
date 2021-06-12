/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex38;

/*
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints
Convert the input to an array.
Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and returns the new array.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        FilterString filter = new FilterString();

        String list = myApp.readInput();
        char[] stringArray = filter.convertInputToArray(list);

        String[] newArray = filter.filterEvenNumbers(stringArray);
        myApp.printArray(newArray);
    }

    public String readInput() {

        System.out.print("Enter a list of numbers, separated by spaces: ");

        return in.nextLine();
    }

    public void printArray(String[] newArr) {
        System.out.print("The even numbers are ");
        for (String c : newArr) {
            System.out.print(c);
        }
    }
}
