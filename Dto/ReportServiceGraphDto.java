package com.example.api.Dto;

import lombok.Data;

import java.util.Map;

@Data
public class ReportServiceGraphDto {
    private String typeService;
    private Map<String,Integer> dataService;
    private String typeSize;
    private Map<String,Integer> dataSize;
    private Integer amountPrice;
    private Integer discountPrice;
    private Double employeePrice;
    private Double profitPrice;
}
