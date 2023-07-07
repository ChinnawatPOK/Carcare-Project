package com.example.api.Dto;

import lombok.Data;

@Data
public class OrderProductDto {
    private Integer productId;
    private Integer amountOrder;
    private String userId;

}
