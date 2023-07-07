package com.example.api.Dto;

import com.example.api.Model.PromotionContract;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PromotionScoreContractUserDto {
    private PromotionContract promotion;
    private Integer currentScore;
    private Integer fullScore;
    private LocalDate expireDate;

}
