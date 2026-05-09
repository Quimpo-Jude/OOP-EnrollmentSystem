package org.example.service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TuitionFeePaymentTest {

    @Test
    public void testCalculateTuitionFee() {
        TuitionFeePayment tuition = new TuitionFeePayment();
        double result = tuition.calculateTuitionFee(5, 0);
        assertEquals(5000, result);
    }

    @Test
    public void testCalculateTuitionWithDiscount() {
        TuitionFeePayment tuition = new TuitionFeePayment();
        double result = tuition.calculateTuitionFee(5, 0.20);
        assertEquals(4000, result);
    }

    @Test
    public void testPaymentBalance() {
        TuitionFeePayment tuition = new TuitionFeePayment();
        tuition.calculateTuitionFee(5, 0);
        tuition.makePayment(3000);
        assertEquals(2000, tuition.getBalance());
    }

    @Test
    public void testFullyPaid() {
        TuitionFeePayment tuition = new TuitionFeePayment();
        tuition.calculateTuitionFee(5, 0);
        tuition.makePayment(5000);
        assertTrue(tuition.isFullyPaid());
    }
}