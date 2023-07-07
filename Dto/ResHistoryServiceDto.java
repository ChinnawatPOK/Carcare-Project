package com.example.api.Dto;

import com.example.api.Model.Payment;
import com.example.api.Model.ServiceTransaction;
import lombok.Data;

@Data
public class ResHistoryServiceDto {
    private ServiceTransaction serviceTransaction;
    private Payment payment;
}
