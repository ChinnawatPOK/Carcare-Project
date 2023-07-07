package com.example.api.Dto;

import com.example.api.Model.OrderProduct;
import com.example.api.Model.ReceivedProduct;
import lombok.Data;

@Data
public class ReceiveRemainDto {
    private OrderProduct orderProduct;
    private Integer receiveRemain;
}
