package com.example.api.Dto;

import lombok.Data;

@Data
public class EditProCollectionDto {
    private Integer promotionId;
    private String promotionName;
    private String promotionDescription;
    private String expireDate;
    private Integer status;
}
