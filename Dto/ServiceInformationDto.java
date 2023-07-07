package com.example.api.Dto;

import com.example.api.Model.ServiceDetails;
import com.example.api.Model.SizeInformation;
import com.example.api.Model.User;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ServiceInformationDto {
    private List<ServiceDetails> typeInfo;
    private List<SizeInformation> sizeType;
    private Set<User> staffInfo;
}
