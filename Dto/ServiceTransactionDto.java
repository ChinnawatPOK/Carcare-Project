package com.example.api.Dto;

import lombok.Data;

import java.util.Set;

@Data
public class ServiceTransactionDto {
    private String userId;
    private String licenseNumber;
    private Set<String> staff;
    private String serviceType;
    private Integer rain;
    private String responsibleStaff;
}
