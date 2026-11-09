package com.codingshuttle.razorpay.payment.config;

import com.codingshuttle.razorpay.common.enums.PaymentMethod;
import com.codingshuttle.razorpay.payment.processor.paymentProcessor;
import com.codingshuttle.razorpay.payment.processor.strategy.CardPaymentProcessor;
import com.codingshuttle.razorpay.payment.processor.strategy.NetBankingPaymentProcessor;
import com.codingshuttle.razorpay.payment.processor.strategy.UpiPaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class PaymentProcessorConfig {

    @Bean
    public Map<PaymentMethod, paymentProcessor> paymentProcessorMap(){
        return Map.of(
        PaymentMethod.UPI, new UpiPaymentProcessor(),
        PaymentMethod.NETBANKING, new NetBankingPaymentProcessor(),
        PaymentMethod.CARDS, new CardPaymentProcessor());
    }
}
