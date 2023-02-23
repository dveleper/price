package com.trade.infrastructure.driven_adapters.persistence.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class ProductData {
    @Id
    @Column(name = "PRODUCT_ID")
    private Integer productId;

    private String product;
}
