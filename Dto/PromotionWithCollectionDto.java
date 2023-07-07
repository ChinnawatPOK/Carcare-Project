package com.example.api.Dto;

import com.example.api.Model.PromotionCollection;
import com.example.api.Model.PromotionCustomer;
import lombok.Data;

@Data
public class PromotionWithCollectionDto {
    private PromotionCustomer promotionCustomer;
    private PromotionCollection promotionCollection;
    private Integer countService;
    private Integer countCondition;
    public PromotionWithCollectionDto(PromotionCustomer promotionCustomer,PromotionCollection promotionCollection,Integer countService,Integer countCondition){
        this.promotionCustomer = promotionCustomer;
        this.promotionCollection = promotionCollection;
        this.countService = countService;
        this.countCondition = countCondition;
    }
}
