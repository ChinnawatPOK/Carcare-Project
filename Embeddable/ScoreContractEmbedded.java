package com.example.api.Embeddable;

import com.example.api.Model.PromotionCustomer;
import com.example.api.Model.ServiceTransaction;
import com.example.api.Model.User;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Embeddable
@Table(name = "score_contract")
public class ScoreContractEmbedded implements Serializable {

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "promotion_customer_id")
    private PromotionCustomer promotionCustomer;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServiceTransaction service;

    public ScoreContractEmbedded(){}

    public ScoreContractEmbedded(User customer,PromotionCustomer promotionCustomer,ServiceTransaction service){
        this.customer =customer;
        this.promotionCustomer = promotionCustomer;
        this.service = service;
    }
}
