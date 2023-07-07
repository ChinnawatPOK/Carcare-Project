package com.example.api.Dto;

import lombok.Data;

import java.util.Set;

@Data
public class EditPrivilegeDto {
    private String userId;
    private Set<Integer> privilegeList;
}
