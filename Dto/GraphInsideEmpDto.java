package com.example.api.Dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class GraphInsideEmpDto {
    private String name;
    private String surname;
    private String serviceType;
    private  String licensePlate;
    private LocalDateTime serviceDate;
    private LocalDateTime finishedDate;
    private Double staffPrice;
    private List<EditUserInfoDto> staffPerson;
    private Integer servicePrice;
    private Integer rateEmp;
}
