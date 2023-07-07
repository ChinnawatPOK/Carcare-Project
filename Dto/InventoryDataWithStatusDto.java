package com.example.api.Dto;

import com.example.api.Model.Inventory;
import lombok.Data;

@Data
public class InventoryDataWithStatusDto {
    private Inventory inventory;
    private String statusCode;
    private String status;
}
