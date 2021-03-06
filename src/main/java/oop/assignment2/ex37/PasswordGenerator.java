/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex37;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {

    Random randomNumbers = new Random();

    public ArrayList<Integer> randPassword(int numNums, int specialChar, int minLength) {

        ArrayList<Integer> password;
        PasswordGenerator generatePassword = new PasswordGenerator();

        ArrayList<Integer> ints = generatePassword.randInts(numNums);
        ArrayList<Integer> specialChars = generatePassword.randSpecialChars(specialChar);

        int total = numNums + specialChar;
        ArrayList<Integer> chars = generatePassword.randChar(total, minLength);

        password = ints;
        password.addAll(specialChars);
        password.addAll(chars);

        return password;
    }


    public ArrayList<Integer> randSpecialChars(int specialChar) {
        ArrayList<Integer> listSpecialChars = new ArrayList<>();

        for (int i = 0; i < specialChar; i++) {
            int randAscii = 1 + randomNumbers.nextInt(32);
            listSpecialChars.add(determineSpecialChar(randAscii));
        }

        return listSpecialChars;
    }

    public ArrayList<Integer> randInts( int numNums) {
        ArrayList<Integer> listInts = new ArrayList<>();

        for (int i = 0; i < numNums; i++) {
            int randInt = randomNumbers.nextInt(9);
            listInts.add(randInt);
        }

        return listInts;
    }

    public ArrayList<Integer> randChar(int total, int minLength) {
        ArrayList<Integer> listChars = new ArrayList<>();

        int numLetters = 0;

        while (numLetters < total){
            int randChar = 1 + randomNumbers.nextInt(52);
            listChars.add(determineChar(randChar));
            numLetters++;
        }

        if (total + numLetters < minLength) {
            while (total + numLetters < minLength) {
                int randChar = 1 + randomNumbers.nextInt(52);
                listChars.add(determineChar(randChar));
                numLetters++;
            }
        }

        return listChars;
    }

    public int determineSpecialChar(int randAscii) {
        if (randAscii <= 15) {
            return randAscii + 32;
        }

        else if (randAscii <= 22) {
            return randAscii + 42;
        }


        else if (randAscii <= 28) {
            return randAscii + 68;
        }

        else {
            return randAscii + 94;
        }
    }

    public int determineChar(int randChar) {
        if (randChar <= 26) {
            return randChar + 64;
        }
        else {
            return randChar + 70;
        }
    }
}


