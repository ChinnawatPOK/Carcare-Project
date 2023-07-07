package com.example.api.Dto;

import lombok.Data;

@Data
public class ReceivedDto {
    private Integer orderId;
    private String receiver;
    private Integer amount;
    private String description;
}
