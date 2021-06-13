/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex25;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PasswordValidator validator = new PasswordValidator();

        String myPassword = myApp.readPassword();

        int strength = validator.passwordValidator(myPassword);

        String output = myApp.generateOutput(strength, myPassword);
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
