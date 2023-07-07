package com.example.api.Model;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "coupon_customer")
public class CouponCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_customer_id")
    private Integer couponCustomerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @Column(name = "received_date")
    private LocalDateTime receivedDate;

    @Column(name = "expired_date")
    private LocalDateTime expiredDate;

    @Column(name = "status_coupon")
    private Integer couponStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @Column(name = "qrcode_coupon")
    private String qrCode;
}
