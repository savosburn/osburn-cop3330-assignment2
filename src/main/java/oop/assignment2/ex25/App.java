/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex25;

/*
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password as its argument and
returns a value you can evaluate to determine the password strength.
Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PasswordValidator validator = new PasswordValidator();

        // read in password
        String myPassword = myApp.readPassword();

        // determine password strength
        int validationStrength = validator.passwordValidator(myPassword);

        String output = myApp.generateOutput(validationStrength, myPassword);
        myApp.output(output);
    }

    public String readPassword() {
        System.out.print("Please enter your password: ");
        return in.nextLine();
    }

    public String generateOutput(int validationStrength, String password) {
        return switch (validationStrength) {
            case 0 -> String.format("The password '%s' is a very weak password.", password);
            case 1 -> String.format("The password '%s' is a weak password.", password);
            case 2 -> String.format("The password '%s' is a strong password.", password);
            case 3 -> String.format("The password '%s' is a very strong password.", password);
            default -> "Invalid password";
        };
    }

    public void output(String output) {
        System.out.println(output);
    }
}
