package org.example.service;

public interface TuitionFeeInterface {
    double calculateTuitionFee(int units, double discountRate);
    void makePayment(double amount);
    double getBalance();
    boolean isFullyPaid();
}