/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex33;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MagicEightBallTest {

    @Test
    void randomAnswers_choice_zero() {
        MagicEightBall eightBall = new MagicEightBall();

        String actual = eightBall.randomAnswers(0);

        assertNull(actual);
    }

    @Test
    void randomAnswers_choice_one() {
        MagicEightBall eightBall = new MagicEightBall();

        String expected = "Yes";
        String actual = eightBall.randomAnswers(1);

        assertEquals(expected, actual);
    }

    @Test
    void randomAnswers_choice_two() {
        MagicEightBall eightBall = new MagicEightBall();

        String expected = "No";
        String actual = eightBall.randomAnswers(2);

        assertEquals(expected, actual);
    }

    @Test
    void randomAnswers_choice_three() {
        MagicEightBall eightBall = new MagicEightBall();

        String expected = "Maybe";
        String actual = eightBall.randomAnswers(3);

        assertEquals(expected, actual);
    }

    @Test
    void randomAnswers_choice_four() {
        MagicEightBall eightBall = new MagicEightBall();

        String expected = "Ask again later.";
        String actual = eightBall.randomAnswers(4);

        assertEquals(expected, actual);
    }

    @Test
    void randomAnswers_choice_five() {
        MagicEightBall eightBall = new MagicEightBall();

        String actual = eightBall.randomAnswers(5);

        assertNull(actual);
    }
}