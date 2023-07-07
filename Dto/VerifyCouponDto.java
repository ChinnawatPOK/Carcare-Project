package com.example.api.Dto;

import lombok.Data;

@Data
public class VerifyCouponDto {
    private String customerId;
    private String qrCode;
}
