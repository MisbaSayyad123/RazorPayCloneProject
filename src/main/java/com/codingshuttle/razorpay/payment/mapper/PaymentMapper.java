package com.codingshuttle.razorpay.payment.mapper;

import com.codingshuttle.razorpay.payment.dto.response.OrderResponse;
import com.codingshuttle.razorpay.payment.dto.response.PaymentResponse;
import com.codingshuttle.razorpay.payment.entity.OrderRecord;
import com.codingshuttle.razorpay.payment.entity.Payment;
import jakarta.persistence.MapsId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel= MappingConstants.ComponentModel.SPRING)
public interface PaymentMapper {

    @Mapping(target = "orderId", source = "orderRecord.id")
    PaymentResponse toResponse(Payment payment);

    @Mapping(target = "orderId", source = "orderRecord.id")
    List<PaymentResponse> toPaymentResponselist(List<Payment> payment) ;


}
