package oop.assignment2.ex26;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double apr, double b, double p) {

        double i = apr / 365;
        double powOne = Math.pow((1 + i), 30);
        double log = Math.log10(1 + i);

        return Math.ceil((-1.0/30.0) * Math.log10(1 + b/p * (1.0 - powOne)) / log);
    }
}
