package com.example.api.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ReportCouponAvailableDto {
    private String couponName;
    private Integer couponPrice;
    private LocalDate expireDate;
    private Integer expireDayIn;
}
