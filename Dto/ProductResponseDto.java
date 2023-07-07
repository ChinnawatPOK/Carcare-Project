package com.example.api.Dto;

import com.example.api.Model.ProductInventory;
import lombok.Data;

@Data
public class ProductResponseDto {
    private ProductInventory productInventory;
    private byte[] picture;
    private Integer quantityRemain;
}
