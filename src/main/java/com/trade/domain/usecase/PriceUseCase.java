package com.trade.domain.usecase;

import com.trade.domain.model.Input;
import com.trade.domain.model.Output;

public interface PriceUseCase {
    Output getPriceByProductIdAndBrandId(Input input);
}
