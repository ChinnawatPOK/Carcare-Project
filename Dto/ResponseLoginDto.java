package com.example.api.Dto;

import com.example.api.Model.User;
import lombok.Data;

@Data
public class ResponseLoginDto {
    private String token;
    private User userInfo;

    public ResponseLoginDto(String token,User user){
        this.token = token;
        this.userInfo = user;
    }
}
