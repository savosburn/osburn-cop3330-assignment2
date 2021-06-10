package oop.assignment2.ex26;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double apr, double b, double p) {

        double i = apr / 365;

        double powOne = Math.pow((1 + i), 30);

        System.out.printf("pow One = %f", powOne);

        double log = Math.log10(1 + i);

        System.out.printf("log = %f", log);

        return (-1/30.0) * Math.log10(1 + b/p * (1.0 - powOne)) / log ;
    }

    // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    //where
    //
    //n is the number of months.
    //i is the daily rate (APR divided by 365).
    //b is the balance.
    //p is the monthly payment.
}
