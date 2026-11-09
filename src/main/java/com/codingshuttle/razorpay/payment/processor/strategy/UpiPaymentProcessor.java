package com.codingshuttle.razorpay.payment.processor.strategy;

import com.codingshuttle.razorpay.payment.processor.paymentProcessor;
import com.codingshuttle.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.codingshuttle.razorpay.payment.processor.dto.PaymentProcessorResponse;

public class UpiPaymentProcessor implements paymentProcessor {
    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}
