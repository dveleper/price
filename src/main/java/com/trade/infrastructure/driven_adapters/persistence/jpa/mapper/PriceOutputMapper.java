package com.trade.infrastructure.driven_adapters.persistence.jpa.mapper;

import com.trade.domain.model.Output;
import com.trade.infrastructure.driven_adapters.persistence.jpa.PriceData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PriceOutputMapper {

    @Mappings({
            @Mapping(source = "product.productId", target = "productId"),
            @Mapping(source = "brand.brandId", target = "brandId")
    })
    Output priceToOutput(PriceData data);
}
