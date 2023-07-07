package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "promotion_customer")
public class PromotionCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promotion_customer_id")
    private Integer promotionCustomerId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @Column(name = "promotion_type")
    private Integer promotionType;

    @Column(name = "promotion_id")
    private Integer promotionId;

    @Column(name = "promotion_status")
    private Integer promotionStatus;

    @Column(name = "cutoff_condition")
    private Integer cutOffCondition;

    @Column(name = "cutoff_couponid")
    private Integer cutOffCoupon;

    @Column(name = "expired_promotion")
    private LocalDateTime expiredPromotion;

    @Column(name = "application_date")
    private LocalDateTime applicationPromotion;
}
