package com.example.api.Dto;

import com.example.api.Model.ServiceTransaction;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
public class SummaryServiceEmpDto {
    private LocalDate serviceDate;
    private Double totalPerDay;
    private List<HistoryEmpInsideListDto> dataList;
}
