package com.example.api.Model;

import com.example.api.Embeddable.CouponUsageEmbedded;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "coupon_usage")
public class CouponUsage {

    @EmbeddedId
    private CouponUsageEmbedded couponUsageEmbedded;

    @Column(name = "spent_date")
    private LocalDateTime spentDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    public CouponUsage() {}

    public CouponUsage(CouponUsageEmbedded couponUsageEmbedded,LocalDateTime spentDate,User customer){
        this.couponUsageEmbedded =couponUsageEmbedded;
        this.spentDate =spentDate;
        this.customer = customer;

    }
}
