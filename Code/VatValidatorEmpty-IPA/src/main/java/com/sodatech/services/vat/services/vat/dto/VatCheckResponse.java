package com.sodatech.services.vat.services.vat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class VatCheckResponse {
    private String vatNumber;
    private boolean valid;
    private Date requestDate;
    private String countryCode;

    public VatCheckResponse() {
        // empty.
    }

    public VatCheckResponse(String vatNumber, boolean valid, Date requestDate, String countryCode) {
        this.vatNumber = vatNumber;
        this.valid = valid;
        this.requestDate = requestDate;
        this.countryCode = countryCode;
    }

}
