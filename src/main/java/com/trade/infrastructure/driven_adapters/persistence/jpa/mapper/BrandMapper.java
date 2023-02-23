package com.trade.infrastructure.driven_adapters.persistence.jpa.mapper;

import com.trade.domain.model.Brand;
import com.trade.infrastructure.driven_adapters.persistence.jpa.BrandData;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandMapper {
    Brand toBrand(BrandData brandData);

    @InheritInverseConfiguration
    BrandData toBrandData(Brand brand);
}
