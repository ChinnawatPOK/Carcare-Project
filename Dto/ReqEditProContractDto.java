package com.example.api.Dto;

import lombok.Data;

@Data
public class ReqEditProContractDto {
    private Integer promotionId;
    private String promotionName;
    private String promotionDescription;
    private Integer promotionPrice;
    private Integer expireDay;
    private Integer status;
}
