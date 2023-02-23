package com.trade.infrastructure.driven_adapters.persistence.jpa.repository;

import com.trade.domain.model.Input;
import com.trade.infrastructure.driven_adapters.persistence.jpa.PriceData;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PriceDataRepository extends CrudRepository<PriceData, Integer> {
    Optional<List<PriceData>> findByProductProductIdAndBrandBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual
            (Integer productId, Integer brandId, Date dateOne, Date dateTwo);

}
