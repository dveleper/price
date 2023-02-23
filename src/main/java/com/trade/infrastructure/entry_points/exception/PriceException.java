package com.trade.infrastructure.entry_points.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FOUND)
public class PriceException extends RuntimeException {
    public PriceException(String message) {
        super(message);
    }
}
