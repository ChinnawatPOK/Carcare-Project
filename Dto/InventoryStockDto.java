package com.example.api.Dto;

import com.example.api.Model.Inventory;
import com.example.api.Model.ProductInventory;
import lombok.Data;

@Data
public class InventoryStockDto {
    private ProductInventory product;
    private Integer quantityRemain;
}
