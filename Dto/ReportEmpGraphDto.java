package com.example.api.Dto;

import com.example.api.Model.User;
import lombok.Data;

import java.util.Map;

@Data
public class ReportEmpGraphDto {
    private String userId;
    private String name;
    private String surname;
    private Double amountPrice;
}
