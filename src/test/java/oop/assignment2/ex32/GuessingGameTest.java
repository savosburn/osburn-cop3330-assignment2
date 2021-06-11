package oop.assignment2.ex32;

import org.junit.jupiter.api.Test;

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

}