package com.example.api.Dto;

import com.example.api.Model.Privilege;
import lombok.Data;

import java.util.Set;

@Data
public class GetPrivilegeDto {
    private Privilege privilege;
    private Set<Privilege> privilegeList;
}
