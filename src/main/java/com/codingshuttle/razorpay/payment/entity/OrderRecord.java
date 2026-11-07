package com.codingshuttle.razorpay.payment.entity;

import com.codingshuttle.razorpay.common.entity.BaseEntity;
import com.codingshuttle.razorpay.common.entity.Money;
import com.codingshuttle.razorpay.common.enums.OrderStatus;
import com.codingshuttle.razorpay.merchant.entity.Merchant;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="order_record",
        indexes = {
                @Index(name = "idx_order_id_merchant_id", columnList = "id, merchant_id"),
                @Index(name = "idx_order_merchant_id", columnList = "merchant_id")

        })
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRecord extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, name = "merchant_id")
    private UUID merchantId;

    @Embedded
    private Money amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private OrderStatus orderStatus;

    @Column(length = 100)
    private String receipt;

    @Column(nullable = false)
    @Builder.Default
    private Integer attempts=0;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> notes;

    @Column(nullable = false)
    private LocalDateTime expiredAt;
}
