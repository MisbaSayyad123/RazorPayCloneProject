package com.codingshuttle.razorpay.payment.gateway.dto;

import com.codingshuttle.razorpay.common.entity.Money;
import com.codingshuttle.razorpay.common.enums.PaymentMethod;

import java.util.Map;
import java.util.UUID;

public record PaymentRequest (

        UUID merchantId,
        UUID orderId,
        UUID paymentId,
        Money amount,
        PaymentMethod methods,
        Map<String,Object> methodDetails
){
}
