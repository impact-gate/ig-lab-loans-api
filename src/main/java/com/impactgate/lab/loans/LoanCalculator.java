package com.impactgate.lab.loans;

public class LoanCalculator {
    public static long calculateMonthlyPayment(long principalCents, int interestRateBps, int termMonths) {
        if (termMonths <= 0) return 0;
        double annualRate = interestRateBps / 10000.0;
        double monthlyRate = annualRate / 12.0;
        if (monthlyRate == 0) return principalCents / termMonths;
        double factor = Math.pow(1 + monthlyRate, termMonths);
        double monthlyPayment = (principalCents * monthlyRate * factor) / (factor - 1);
        return Math.round(monthlyPayment);
    }
}
