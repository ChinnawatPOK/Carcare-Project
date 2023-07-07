package com.example.api.Dto;

import lombok.Data;

@Data
public class EditUserInfoDto {
    private String userId;
    private String name;
    private String surname;
    private String phone;
    private String username;
    private String password;
}
