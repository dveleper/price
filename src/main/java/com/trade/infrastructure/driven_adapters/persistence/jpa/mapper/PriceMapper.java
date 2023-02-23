package com.trade.infrastructure.driven_adapters.persistence.jpa.mapper;

import com.trade.domain.model.Price;
import com.trade.infrastructure.driven_adapters.persistence.jpa.PriceData;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    Price toPrice(PriceData priceData);

    @InheritInverseConfiguration
    PriceData toPriceData(Price price);
}
