package com.kar.steps.Interface;

class SavingsAccount implements RateOfInterest {
    private final double interestRate;

    // Constructor
    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getRateOfInterest() {
        return interestRate;
    }
}