package com.codingshuttle.razorpay.payment.processor.dto;

public sealed interface PaymentProcessorResponse permits
PaymentProcessorResponse.Pending,
PaymentProcessorResponse.Success,
        PaymentProcessorResponse.Failure
{
    record Pending(String processorReference) implements PaymentProcessorResponse{}

    record Success(String ProcessorReference, String bankReference) implements PaymentProcessorResponse{}

    record Failure(String errorCode, String errorDescription) implements PaymentProcessorResponse{}
}
