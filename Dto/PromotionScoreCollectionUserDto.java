package com.example.api.Dto;

import com.example.api.Model.PromotionCollection;
import lombok.Data;

@Data
public class PromotionScoreCollectionUserDto {
    private PromotionCollection promotion;
    private Integer currentScore;
    private Integer fullScore;
}
