package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionFeePaymentTest {
    private TuitionFeePayment tuitionFeePayment;
    @BeforeEach
    void setup(){
        tuitionFeePayment = new TuitionFeePayment();
    }
    @Test
    @DisplayName("Calculate Tuition Fee")
    void shouldCalculateCorrectTuitionFeeWithNoDiscount(){
        assertEquals(5000,tuitionFeePayment.calculateTuitionFee(5, 0));
    }
    @Test
    void shouldCalculateCorrectTuitionFeeWithDiscount(){
        assertEquals(4500,tuitionFeePayment.calculateTuitionFee(5,0.10));
    }
    @Test
    void shouldMakePaymentWorth500(){
        tuitionFeePayment.calculateTuitionFee(5,0);
        tuitionFeePayment.makePayment(500);

        assertEquals(4500, tuitionFeePayment.getBalance());
    }
}

