package com.trade.utils;

import com.trade.infrastructure.entry_points.exception.PriceException;
import lombok.extern.log4j.Log4j2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Log4j2
public class UtislDate {

    public static Date toDate(String date)  {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
            return format.parse(date);
        } catch (ParseException e) {
            log.error(e.getMessage());
            throw new PriceException(e.getMessage());
        }
    }
}
