package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void print_total_5_num() {
        App myApp = new App();

        double[] array = {1, 2, 3, 4, 5};

        double expectedOutput = 15;
        double actualOutput = myApp.addNumbers(array);

        assertEquals(expectedOutput, actualOutput);
    }


}