package com.example.api.Dto;

import com.example.api.Model.Role;
import lombok.Data;

import java.util.Set;

@Data
public class EmpWithImageDto {
    private String userId;
    private String name;
    private String surname;
    private String phone;
    private Integer permissionLine;
    private String email;
    private String username;
    private String password;
    private byte[] qrCodeImage;
    private Set<Role> role;
    private String imageLine;
}
