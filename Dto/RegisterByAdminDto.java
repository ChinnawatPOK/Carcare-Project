package com.example.api.Dto;

import lombok.Data;

import java.util.Set;

@Data
public class RegisterByAdminDto {
    private String name;
    private String surname;
    private String phone;
    private String username;
    private String password;
    private Integer role;
    private Set<Integer> privileges;
}
