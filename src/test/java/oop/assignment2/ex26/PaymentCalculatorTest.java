package oop.assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator paymentCalc = new PaymentCalculator();

        double expected = 100.0;
        double actual = paymentCalc.calculateMonthsUntilPaidOff(.12, 5000, 100);

        assertEquals(expected, actual, 0.000000001);
    }
}