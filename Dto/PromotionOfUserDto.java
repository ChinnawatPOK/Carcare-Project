package com.example.api.Dto;

import com.example.api.Model.PromotionCollection;
import com.example.api.Model.PromotionContract;
import com.example.api.Model.PromotionCustomer;
import lombok.Data;

import java.util.List;

@Data
public class PromotionOfUserDto {
    private List<PromotionWithCollectionDto> promotionCollections;
    private List<PromotionWithContractDto> promotionContracts;
    private Boolean proCollectionStatus;
}
