package com.example.api.Dto;

import com.example.api.Model.User;
import lombok.Data;

@Data
public class ResultCheckDto {
    private Boolean result;
    private User user;
}
