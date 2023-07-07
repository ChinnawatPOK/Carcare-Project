package com.example.api.Dto;

import lombok.Data;

import java.util.List;

@Data
public class ReportCouponWithTotalPriceDto {
    private String userId;
    private String name;
    private String surname;
    private List<ReportCouponAvailableDto> couponList;
}
