package com.example.api.Dto;

import lombok.Data;

@Data
public class SendLineReportDto {
    private String userId;
    private String userLine;
    private Integer promotionCustomer;
    private Integer point;
}
