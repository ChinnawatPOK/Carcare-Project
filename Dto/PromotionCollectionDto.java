package com.example.api.Dto;

import lombok.Data;

@Data
public class PromotionCollectionDto {
    private String promotionName;
    private String promotionDescription;
    private Integer promotionCondition;
    private String carType;
    private Integer coupon;
    private Integer promotionStatus;
    private Integer promotionMinimum;
    private String startDate;
    private String endDate;
}
