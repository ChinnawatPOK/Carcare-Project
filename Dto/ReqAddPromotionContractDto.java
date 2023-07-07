package com.example.api.Dto;

import lombok.Data;

@Data
public class ReqAddPromotionContractDto {
    private String promotionName;
    private String promotionDescription;
    private String serviceType;
    private Integer promotionPrice;
    private Integer promotionStatus;
    private Integer expiredDays;
    private Integer conditionTime;
}
