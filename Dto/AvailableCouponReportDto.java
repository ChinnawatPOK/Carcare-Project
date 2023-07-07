package com.example.api.Dto;

import lombok.Data;

import java.util.List;

@Data
public class AvailableCouponReportDto {
    private Integer total;
    private List<ReportCouponWithTotalPriceDto> dataList;
}
