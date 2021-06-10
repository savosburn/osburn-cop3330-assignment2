/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    public void is_same_length() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isSameLength("star", "tars");

        assertTrue(actual);
    }

    @Test
    public void is_not_same_length() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isSameLength("star", "twirl");

        assertFalse(actual);
    }

    @Test
    public void is_anagram_same_word() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram(true, "star", "star");

        assertTrue(actual);
    }

    @Test
    public void is_anagram_different_word_same_length() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram(true, "star", "tars");

        assertTrue(actual);
    }

    @Test
    public void not_anagram_different_word_different_length() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram(false, "star", "twirl");

        assertFalse(actual);
    }

    @Test
    public void not_anagram_different_word_same_length() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram(true, "star", "fizz");

        assertFalse(actual);
    }

}