package com.example.api.Dto;

import com.example.api.Model.PickupInventory;
import lombok.Data;

@Data
public class PickupRemainDto {
    private PickupInventory pickupInventory;
    private Integer quantityRemain;
}
