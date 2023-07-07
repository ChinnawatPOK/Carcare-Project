package com.example.api.Dto;

import lombok.Data;

@Data
public class PickupDto {
    private Integer productId;
    private Integer amount;
    private String userId;
    private String description;
}
