/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment2.ex37;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void output() {
        PasswordRandomnizer randomnizer = new PasswordRandomnizer();

        StringBuilder password = randomnizer.randomnize(2, 2, 8);

        StringBuilder expected = password;
        StringBuilder actual = password;

        assertEquals(expected, actual);
    }

}