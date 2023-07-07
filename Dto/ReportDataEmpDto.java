package com.example.api.Dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ReportDataEmpDto {
    private LocalDate date;
    private List<GraphInsideEmpDto> insideData;
    private Double amountPrice;
}
