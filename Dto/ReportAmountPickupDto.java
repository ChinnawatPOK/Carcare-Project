package com.example.api.Dto;

import com.example.api.Model.Inventory;
import com.example.api.Model.PickupInventory;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ReportAmountPickupDto {
    private Integer totalPurchase;
    private List<PickupInventory> inventoryList;
    private LocalDate startDate;
    private LocalDate endDate;
}
