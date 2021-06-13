/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex37;

import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomnizer {
    Random randomNumbers = new Random();

    public StringBuilder randomnize(int numNums, int specialChars, int minLength) {
        PasswordGenerator generatePassword = new PasswordGenerator();

        ArrayList<Integer> password;
        password = generatePassword.randPassword(numNums, specialChars, minLength);

        StringBuilder retString = new StringBuilder();

        retString.append("Your password is ");

        int loop = password.size();
        while (loop != 0) {

            int randVal = randomNumbers.nextInt(password.size());

            String val;

            if (password.get(randVal) >= 0 && password.get(randVal) <= 9) {
                val = String.valueOf(password.get(randVal));
            }

            else {
                val = Character.toString(password.get(randVal));
            }

            retString.append(val);

            password.remove(randVal);
            loop--;
        }

        return retString;
    }
}
