package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "promotion_contract")
public class PromotionContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promotion_contract")
    private Integer promotionContractId;

    @Column(name = "promotion_name")
    private String promotionName;

    @Column(name = "promotion_description")
    private String promotionDescription;

    @Column(name = "condition_time")
    private Integer conditionTime;

    @Column(name = "promotion_price")
    private Integer promotionPrice;

    @ManyToOne
    @JoinColumn(name = "service_type")
    private ServiceType serviceType;

    @Column(name = "promotion_status")
    private Integer promotionStatus;

    @Column(name = "expired_days")
    private Integer expiredDays;
}
