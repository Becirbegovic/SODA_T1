package com.sodatech.services.vat.client;

import com.sodatech.services.vat.generated.CheckVatResponse;

public interface VatServiceClient {
    CheckVatResponse validateVatUsingSoapService(String countryCode, String vatNumber) throws VatServiceClientUnauthorizedException;
}
