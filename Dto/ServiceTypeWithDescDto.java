package com.example.api.Dto;


import com.example.api.Model.ServiceType;
import com.example.api.Model.SizeInformation;
import lombok.Data;

@Data
public class ServiceTypeWithDescDto {
    private ServiceType serviceType;
    private SizeInformation sizeInformation;
}
