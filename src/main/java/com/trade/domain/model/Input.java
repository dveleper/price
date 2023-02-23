package com.trade.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Data
@ToString
public class Input implements Serializable {
    @JsonFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    private String dateIn;
    private Date date;
    private Integer productId;
    private Integer brandId;
}
