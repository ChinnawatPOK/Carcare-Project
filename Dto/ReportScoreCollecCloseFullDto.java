package com.example.api.Dto;

import lombok.Data;

@Data
public class ReportScoreCollecCloseFullDto {
    private String userId;
    private String name;
    private String surname;
    private String promotionType;
    private String lineId;
    private Integer permissionLine;
    private Integer promotionCustomer;
    private Integer fullScore;
    private Integer currentScore;
    private Integer remainScore;
}
