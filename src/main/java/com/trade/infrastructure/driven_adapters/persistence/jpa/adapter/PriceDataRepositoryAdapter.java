package com.trade.infrastructure.driven_adapters.persistence.jpa.adapter;

import com.trade.domain.model.Input;
import com.trade.domain.model.Output;
import com.trade.domain.model.repository.PriceRepository;
import com.trade.infrastructure.driven_adapters.persistence.jpa.PriceData;
import com.trade.infrastructure.driven_adapters.persistence.jpa.mapper.PriceOutputMapper;
import com.trade.infrastructure.driven_adapters.persistence.jpa.repository.PriceDataRepository;
import com.trade.infrastructure.entry_points.exception.PriceException;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
@Log4j2
public class PriceDataRepositoryAdapter implements PriceRepository {

    private final PriceDataRepository repository;
    private final PriceOutputMapper mapper;

    @Override
    public Output getPriceByProductIdAndBrandId(Input input){
        Optional<List<PriceData>> priceData = repository
                .findByProductProductIdAndBrandBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
                        input.getProductId(), input.getBrandId(), input.getDate(), input.getDate()
                );
        if (!priceData.isPresent() || priceData.get().size() ==0) {
            log.error("Price not found for input : " + input);
            throw new PriceException("Price not found");
        }
        return mapper.priceToOutput(
                priceData.get().stream()
                        .max(Comparator.comparingInt(PriceData::getPriority))
                        .get());
    }
}
