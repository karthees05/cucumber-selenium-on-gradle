package com.kar.steps.Interface;

class FixedDeposit implements RateOfInterest {
    private final double interestRate;

    // Constructor
    public FixedDeposit(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getRateOfInterest() {
        return interestRate;
    }
}

