package com.example.api.Dto;

import com.example.api.Model.Line;
import com.example.api.Model.User;
import lombok.Data;

@Data
public class AllUserDto {
    private User user;
    private Line line;
}
