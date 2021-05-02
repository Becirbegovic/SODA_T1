package com.sodatech.services.vat.services.vat.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Schema(description = "Hallo")
public class VatCheckRequest {


    private String countryCode;


    private String vatId;

}
