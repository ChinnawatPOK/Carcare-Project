package com.example.api.Dto;

import lombok.Data;

@Data
public class PaymentDto {
    private Integer service;
    private String user;
    private Integer promotionCustomerId;
    private Integer couponCustomerId;
    private Integer promotionType;
}
