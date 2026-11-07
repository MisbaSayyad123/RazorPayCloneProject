package com.codingshuttle.razorpay.vault.entity;

import com.codingshuttle.razorpay.common.entity.BaseEntity;
import com.codingshuttle.razorpay.merchant.entity.Merchant;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="card_token")
public class CardToken extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vault_card_id", nullable = false)
    private VaultCard vaultCard;

    @Column(length = 50, nullable = false, unique = true)
    private String token;

    @Column(nullable = false)
    private UUID customer;

    @Column(nullable = false)
    private UUID merchant;

    private LocalDateTime revokedAt;
}
