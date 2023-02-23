package com.trade.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Data
public class Output {
    private Integer productId;
    private Integer brandId;
    private BigDecimal price;
    @JsonFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    private Date startDate;
    @JsonFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    private Date endDate;
}
