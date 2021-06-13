package oop.assignment2.ex32;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    @Test
    void test() {
        String expected = """
                I have my number. What's your guess? 500
                Too low. Guess again: 750
                Too high. Guess again: 600
                Too low. Guess again: 700
                Too low. Guess again: 725
                Too high. Guess again: 715
                Too high. Guess again: 710
                Too high. Guess again: 705
                Too high. Guess again: 701
                Too low. Guess again: 702
                You got it in 10 guesses!""";
    }

    @Test
    void game() {
    }

    @Test
    void difficulty() {
        GuessingGame game = new GuessingGame();

        int expected = 3;
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("3", game.difficulty());
    }

    @Test
    void randomNum() {
    }

    @Test
    void userGuesses() {
    }

    @Test
    void output() {
    }

    @Test
    void playAgain() {
    }
}