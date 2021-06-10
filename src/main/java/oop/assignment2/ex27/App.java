/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex27;

/*
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a
 program into smaller functions that do one thing each. The program can then call these functions in sequence to
  perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input
is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234

The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.

Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Constraints
Create a function for each type of validation you need to write.
Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Validation validator = new Validation();

        // scan
        String firstName = myApp.readString("Enter the first name: ");
        String lastName = myApp.readString("Enter the last name: ");
        String zipCode = myApp.readString("Enter the ZIP code: ");
        String employeeID = myApp.readString("Enter the employeeID: ");

        // validate
        String output = validator.ValidateInput(firstName, lastName, zipCode, employeeID);
        myApp.print(output);
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public void print(String output) {
        System.out.println(output);
    }


}
