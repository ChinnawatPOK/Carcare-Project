package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "coupon")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_id")
    private Integer couponId;

    @Column(name = "price_of_coupon")
    private Integer couponPrice;

    @Column(name = "description_coupon")
    private String couponDescription;

    @Column(name = "status_coupon")
    private Integer couponStatus;

    @Column(name = "coupon_constraints")
    private Integer couponConstraint;

    @Column(name = "expire_in_day")
    private Integer expireDay;

}
