/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContestTest {

    @Test
    void winner_zero() {
        Contest contest = new Contest();
        ArrayList<String> list = new ArrayList<>();
        list.add("Homer");
        list.add("Maggie");
        list.add("Moe");
        list.add("Lisa");

        String expected = "The winner is... Homer";
        String actual = contest.winner(list, 0);

        assertEquals(expected, actual);
    }

    @Test
    void winner_one() {
        Contest contest = new Contest();
        ArrayList<String> list = new ArrayList<>();
        list.add("Homer");
        list.add("Maggie");
        list.add("Moe");
        list.add("Lisa");

        String expected = "The winner is... Maggie";
        String actual = contest.winner(list, 1);

        assertEquals(expected, actual);
    }
    @Test
    void winner_two() {
        Contest contest = new Contest();
        ArrayList<String> list = new ArrayList<>();
        list.add("Homer");
        list.add("Maggie");
        list.add("Moe");
        list.add("Lisa");

        String expected = "The winner is... Moe";
        String actual = contest.winner(list, 2);

        assertEquals(expected, actual);
    }

    @Test
    void winner_three() {
        Contest contest = new Contest();
        ArrayList<String> list = new ArrayList<>();
        list.add("Homer");
        list.add("Maggie");
        list.add("Moe");
        list.add("Lisa");

        String expected = "The winner is... Lisa";
        String actual = contest.winner(list, 3);

        assertEquals(expected, actual);
    }
}