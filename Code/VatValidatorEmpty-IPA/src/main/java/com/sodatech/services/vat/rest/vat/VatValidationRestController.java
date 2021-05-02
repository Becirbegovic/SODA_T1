package com.sodatech.services.vat.rest.vat;

import com.sodatech.services.vat.generated.CheckVatResponse;
import com.sodatech.services.vat.rest.ping.dto.PingResponse;
import com.sodatech.services.vat.rest.vat.dto.VatValidationRequest;
import com.sodatech.services.vat.rest.vat.dto.VatValidationResponse;
import com.sodatech.services.vat.services.vat.VatCheckService;
import com.sodatech.services.vat.services.vat.VatServiceUnauthorizedException;
import com.sodatech.services.vat.services.vat.dto.VatCheckRequest;
import com.sodatech.services.vat.services.vat.dto.VatCheckResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/v1/vat", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "VATCheck", description = "Überprüft die VAT ID auf Gültigkeit.")
@Slf4j
public class VatValidationRestController {
    private final VatCheckService vatCheckService;

    @Autowired
    public VatValidationRestController(final VatCheckService vatCheckService){ //throws MethodArgumentNotValidException {
        this.vatCheckService = vatCheckService;
    }

    @GetMapping(path = "/check")
    public ResponseEntity<VatValidationResponse> validateVAT(@Valid @Parameter VatValidationRequest request) {
        ResponseEntity<VatValidationResponse> restResponse;
        VatCheckResponse serviceResponse;
        try {
            serviceResponse = this.vatCheckService.checkVat(new VatCheckRequest(request.getCountryCode(), request.getVatId()));
            restResponse = ResponseEntity.ok(new VatValidationResponse(serviceResponse.getVatNumber(), serviceResponse.isValid(), serviceResponse.getRequestDate(), serviceResponse.getCountryCode()));
        } catch (VatServiceUnauthorizedException e) {
            restResponse = ResponseEntity.unprocessableEntity().build();
        }
        return restResponse;
    }







}
