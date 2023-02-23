package com.trade.domain.model.repository;

import com.trade.domain.model.Input;
import com.trade.domain.model.Output;

public interface PriceRepository {
    Output getPriceByProductIdAndBrandId(Input input);
}
