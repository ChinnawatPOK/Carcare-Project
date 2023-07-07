package com.example.api.Dto;

import com.example.api.Model.ServiceDetails;
import com.example.api.Model.ServiceType;
import lombok.Data;

import java.util.List;

@Data
public class ResEditTypeDto {
    private ServiceDetails serviceType;
    private List<ServiceTypeWithDescDto> serviceTypeList;
}
