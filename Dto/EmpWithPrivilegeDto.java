package com.example.api.Dto;

import com.example.api.Model.Privilege;
import com.example.api.Model.User;
import lombok.Data;

import java.util.List;

@Data
public class EmpWithPrivilegeDto {
    private User user;
    private List<Privilege> privilegeList;
}
