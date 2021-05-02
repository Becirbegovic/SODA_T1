package com.sodatech.services.vat.rest.vat.dto;

import lombok.Data;
import javax.validation.constraints.*;



@Data
public class VatValidationRequest {


    //TODO Validierung

    @Pattern (regexp ="[A-Z]{2}", message = "Country Code cannot be null" )
    @NotNull(message = "Country Code cannot be null")
    private String countryCode;

    //@AssertTrue
    //private boolean working;

    @Pattern (regexp ="[0-9A-Za-z\\+\\*\\.]{2,12}", message = "VAT have to be 9 numbers" )
    @NotNull(message = "VAT have to be 9 numbers")
    private String vatId;


}
