package com.example.api.Dto;

import com.example.api.Model.OrderProduct;
import com.example.api.Model.ReceivedProduct;
import lombok.Data;

import java.util.List;

@Data
public class ReceivedTransactionDto {
    private ReceiveRemainDto receiveRemainDto;
    private List<ReceivedProduct> receivedProductList;


}
