package com.example.api.Dto;

import lombok.Data;

import java.util.List;

@Data
public class GetScoreCouponDto {
    private List<PromotionScoreCollectionUserDto> promotionScoreCollectionUserDto;
    private List<PromotionScoreContractUserDto> promotionScoreContractUserDto;
}
