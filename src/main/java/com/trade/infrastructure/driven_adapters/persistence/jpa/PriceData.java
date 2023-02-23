package com.trade.infrastructure.driven_adapters.persistence.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "price")
@Data
public class PriceData {
    @Id
    @GeneratedValue
    private Integer priceList;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    private int priority;
    private BigDecimal price;
    private String curr;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", insertable=false, updatable=false)
    private ProductData product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brandId", insertable=false, updatable=false)
    private BrandData brand;
}
