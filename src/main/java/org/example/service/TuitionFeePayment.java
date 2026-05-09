package org.example.service;

public class TuitionFeePayment implements TuitionFeeInterface {
    private final double PRICE_PER_UNIT = 1000;
    private double balance;
    private double totalFee;

    public double calculateTuitionFee(int units, double discountRate) {
        totalFee = units * PRICE_PER_UNIT;
        if (discountRate != 0) {
            totalFee = totalFee - (totalFee * discountRate);
        }
        balance = totalFee;
        return totalFee;
    }
    public void makePayment(double amount){
        balance = totalFee - amount;
    }
    public double getBalance(){
        return balance;
    }
    public boolean isFullyPaid() {
        return balance <= 0;
    }

}
