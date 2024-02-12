package com.kar.steps.Interface;

import org.junit.Test;

public class Main {
    @Test
    public void main() {
        // Creating objects of the implementing classes
        SavingsAccount savingsAccount = new SavingsAccount(5.0);
        FixedDeposit fixedDeposit = new FixedDeposit(8.0);

        // Using the interface method to get the rate of interest
        System.out.println("Savings Account Interest Rate: " + savingsAccount.getRateOfInterest() + "%");
        System.out.println("Fixed Deposit Interest Rate: " + fixedDeposit.getRateOfInterest() + "%");
    }
}