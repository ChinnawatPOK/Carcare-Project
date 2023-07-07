package com.example.api.Dto;

import com.example.api.Model.User;
import lombok.Data;

@Data
public class ScanQrCodeResponseDto {
    private User user;
    private String picture;
    private String email;
}
