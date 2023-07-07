package com.example.api.Embeddable;

import com.example.api.Model.CouponCustomer;
import com.example.api.Model.Payment;
import com.example.api.Model.ServiceTransaction;
import com.example.api.Model.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
@Table(name = "coupon_usage")
public class CouponUsageEmbedded implements Serializable {

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "coupon_customer_id")
    private CouponCustomer couponCustomerId;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    public CouponUsageEmbedded(){

    }
    public CouponUsageEmbedded(CouponCustomer couponCustomer,Payment payment){
        this.couponCustomerId = couponCustomer;
        this.payment = payment;
    }

}
