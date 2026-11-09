package com.codingshuttle.razorpay.payment.processor;

import com.codingshuttle.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.codingshuttle.razorpay.payment.processor.dto.PaymentProcessorResponse;

public interface paymentProcessor {

    PaymentProcessorResponse charge(PaymentProcessorRequest request);
}
