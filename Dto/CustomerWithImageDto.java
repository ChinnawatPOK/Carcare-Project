package com.example.api.Dto;

import com.example.api.Model.Role;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerWithImageDto {
    private String userId;
    private String name;
    private String surname;
    private String phone;
    private Integer permissionLine;
    private String email;
    private byte[] qrCodeImage;
    private Set<Role> role;
    private String imageLine;
}
