package com.trade.infrastructure.entry_points.api_rest;

import com.trade.domain.model.Input;
import com.trade.domain.model.Output;
import com.trade.domain.usecase.PriceUseCase;
import com.trade.utils.UtislDate;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
@Log4j2
public class PriceController {

    private final PriceUseCase priceUseCase;

    @GetMapping("/price")
    public ResponseEntity<Output> getPrice(@RequestBody Input input) throws ParseException {
        input.setDate(UtislDate.toDate(input.getDateIn()));
        log.info(String.format("Join GET to price with %s", input));
        return new ResponseEntity<>(priceUseCase.getPriceByProductIdAndBrandId(input), HttpStatus.OK);
    }

}
