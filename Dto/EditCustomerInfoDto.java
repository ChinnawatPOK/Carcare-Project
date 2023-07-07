package com.example.api.Dto;

import lombok.Data;

@Data
public class EditCustomerInfoDto {
    private String userId;
    private String name;
    private String surname;
    private String phone;
    private Integer permission;
}
