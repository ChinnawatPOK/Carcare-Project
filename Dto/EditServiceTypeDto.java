package com.example.api.Dto;

import lombok.Data;

@Data
public class EditServiceTypeDto {
    private String serviceId;
    private Integer servicePrice;
    private Integer serviceStatus;
}
