package com.example.api.Dto;

import com.example.api.Model.PromotionCollection;
import com.example.api.Model.PromotionContract;
import com.example.api.Model.PromotionCustomer;
import lombok.Data;

@Data
public class PromotionWithContractDto {
    private PromotionCustomer promotionCustomer;
    private PromotionContract promotionContract;
    private Integer countService;
    private Integer countCondition;
    public PromotionWithContractDto(PromotionCustomer promotionCustomer, PromotionContract promotionContract,Integer countService,Integer countCondition){
        this.promotionCustomer = promotionCustomer;
        this.promotionContract = promotionContract;
        this.countService = countService;
        this.countCondition = countCondition;
    }
}
