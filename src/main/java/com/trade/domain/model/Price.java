package com.trade.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@NoArgsConstructor
@Data
public class Price {
    private Integer priceList;
    private Date startDate;
    private Date endDate;
    private int priority;
    private BigDecimal price;
    private String curr;
    private Product product;
    private Brand brand;
}
