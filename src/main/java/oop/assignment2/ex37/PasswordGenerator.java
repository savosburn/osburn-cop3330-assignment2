/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex37;

import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {

    Random randomNumbers = new Random();
    //PasswordGenerator generatePassword = new PasswordGenerator();

    public ArrayList<Integer> randPassword(int numNums, int specialChar, int minLength) {

        ArrayList<Integer> password = new ArrayList<>();
        PasswordGenerator generatePassword = new PasswordGenerator();


        ArrayList<Integer> ints = generatePassword.randInts(numNums);
        password = ints;
        /*
        ArrayList<Integer> specialChars = (generatePassword.randSpecialChars(password, specialChar));

        int total = numNums + specialChar;
        ArrayList<Integer> chars = generatePassword.randChar(password, total, minLength);

        password = ints;
        password.addAll(specialChars);
        password.addAll(chars);*/

        return password;

    }

    /*
    public ArrayList<Integer> randSpecialChars(ArrayList<Integer> listSpecialChars, int specialChar) {

        for (int i = 0; i < specialChar; i++) {
            int randAscii = 1 + randomNumbers.nextInt(32);
            listSpecialChars.add(generatePassword.determineSpecialChar(randAscii));
        }

        return listSpecialChars;
    }*/

    public ArrayList<Integer> randInts( int numNums) {
        ArrayList<Integer> listInts = new ArrayList<>();
        for (int i = 0; i < numNums; i++) {
            int randInt = randomNumbers.nextInt(9);
            listInts.add(randInt);
        }

        return listInts;
    }
    /*
    public ArrayList<Integer> randChar(ArrayList<Integer> listChars, int total, int minLength) {

        while (total <= minLength){
            int randChar = 1 + randomNumbers.nextInt(52);
            listChars.add(generatePassword.determineChar(randChar));
            total++;
        }

        return listChars;
    }

    public int determineSpecialChar(int randAscii) {

        // first 15: 33-47
        if (randAscii <= 15) {
            return randAscii + 32;
        }
        // next 7: 58 - 64
        else if (randAscii <= 22) {
            return randAscii + 42;
        }

        // next 6: 91 - 96
        else if (randAscii <= 28) {
            return randAscii + 68;
        }
        // next 4: 123 - 126
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
    }*/

}


