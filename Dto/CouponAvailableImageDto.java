package com.example.api.Dto;

import com.example.api.Model.CouponCustomer;
import lombok.Data;

@Data
public class CouponAvailableImageDto {
    private CouponCustomer couponCustomer;
    private byte[] image;
}
