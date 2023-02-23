package com.trade.domain.usecase.impl;

import com.trade.domain.model.Input;
import com.trade.domain.model.Output;
import com.trade.domain.model.repository.PriceRepository;
import com.trade.domain.usecase.PriceUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class PriceUseCaseImpl implements PriceUseCase {

    private final PriceRepository repository;

    @Override
    @Transactional
    public Output getPriceByProductIdAndBrandId(Input input) {
        return repository.getPriceByProductIdAndBrandId(input);
    }
}
