package com.example.api.Dto;

import com.example.api.Model.CouponCustomer;
import lombok.Data;

@Data
public class ResponseVerifyCouponDto {
    private boolean resultVerify;
    private CouponCustomer couponCustomer;

    public ResponseVerifyCouponDto(Boolean resultVerify,CouponCustomer couponCustomer){
        this.resultVerify = resultVerify;
        this.couponCustomer = couponCustomer;
    }
}
