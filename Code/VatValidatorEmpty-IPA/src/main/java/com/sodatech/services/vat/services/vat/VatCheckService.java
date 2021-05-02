package com.sodatech.services.vat.services.vat;

import com.sodatech.services.vat.services.vat.dto.VatCheckRequest;
import com.sodatech.services.vat.services.vat.dto.VatCheckResponse;

public interface VatCheckService {
    VatCheckResponse checkVat(VatCheckRequest checkRequest) throws VatServiceUnauthorizedException;
}
