package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer paymentId;

    @Column(name = "status_payment")
    private Integer paymentStatus;

    @Column(name = "payment_price")
    private Integer paymentPrice;

    @Column(name = "payment_discount")
    private Integer paymentDiscount;

    @Column(name = "payment_amount")
    private Integer paymentAmount;

    @ManyToOne
    @JoinColumn(name = "promotion_customer")
    private  PromotionCustomer promotionCustomer;

    @ManyToOne
    @JoinColumn(name = "coupon_id")
    private Coupon couponId;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoices invoice;

    @Column(name = "date_payment")
    private LocalDateTime paymentDate;

    public Payment() {}


}
