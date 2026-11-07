package com.codingshuttle.razorpay.payment.entity;

import com.codingshuttle.razorpay.common.entity.BaseEntity;
import com.codingshuttle.razorpay.common.entity.Money;
import com.codingshuttle.razorpay.common.enums.PaymentMethods;
import com.codingshuttle.razorpay.common.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="payment",
        indexes = {
                @Index(name = "idx_payment_order_id", columnList = "order_id"),
                @Index(name = "idx_payment_merchant_id", columnList = "merchant_id")
        })
@Builder

public class Payment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id",nullable = false)
    private OrderRecord orderRecord;

    @Column(nullable = false)
    private UUID merchantId;

    @Embedded
    private Money amount;

    @Column(nullable = false, length = 100)
    private String idempotencyKey;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private PaymentStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private PaymentMethods methods;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "method_details", columnDefinition = "jsonb")
    private Map<String, Objects> methodDetails;

    @Column(length = 100)
    private String bankReference;

    @Column(length = 100)
    private String errorCode;

    @Column(length = 255)
    private String errorDescription;

    private LocalDateTime authorizedAt;
    private LocalDateTime capturedAt;
    private LocalDateTime failedAt;
    private LocalDateTime settledAt;
    private LocalDateTime refundedAt;
}
