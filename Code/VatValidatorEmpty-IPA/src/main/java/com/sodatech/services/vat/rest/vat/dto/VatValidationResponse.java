package com.sodatech.services.vat.rest.vat.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "Antwort des VAT...")
public class VatValidationResponse {
    @Schema(description = "boolscher Wert, wenn die Mehrwertsteuernummer gültig ist dann wird ein True zürückgegeben.")
    private String vatNumber;

    @Schema(description = "Is Valid oder nicht",required = true)
    private boolean valid;

    @Schema(description = "Request der Daten")
    private Date requestDate;

    @Schema(description = "Land Code OK")
    private String countryCode;

    public VatValidationResponse(String vatNumber, boolean valid, Date requestDate, String countryCode) {
        this.vatNumber = vatNumber;
        this.valid = valid;
        this.requestDate = requestDate;
        this.countryCode = countryCode;
    }

}