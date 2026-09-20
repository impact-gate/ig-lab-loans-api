package com.impactgate.lab.loans;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanCalculatorTest {
    @Test
    public void testMonthlyPaymentCalculation() {
        // $10,000 principal, 600 bps (6.0%), 12 months
        long payment = LoanCalculator.calculateMonthlyPayment(1000000L, 600, 12);
        assertTrue(payment > 86000L && payment < 87000L, "Monthly payment should be approx $860.66");
    }

    @Test
    public void testZeroInterestCalculation() {
        long payment = LoanCalculator.calculateMonthlyPayment(120000L, 0, 12);
        assertEquals(10000L, payment);
    }
}
