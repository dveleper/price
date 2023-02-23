package com.trade.infrastructure.driven_adapters.persistence.jpa.mapper;

import com.trade.domain.model.Product;
import com.trade.infrastructure.driven_adapters.persistence.jpa.ProductData;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductData productData);

    @InheritInverseConfiguration
    ProductData toProductData(Product product);
}
