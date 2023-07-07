package com.example.api.Dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class HistoryEmpInsideListDto {
    private String serviceType;
    private LocalDateTime date;
    private Integer price;
    private Integer percentage;
    private Double amount;
    private List<NameAndSurnameDto> staffList;
}
