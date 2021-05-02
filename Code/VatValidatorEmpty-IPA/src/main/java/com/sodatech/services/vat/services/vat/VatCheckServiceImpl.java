package com.sodatech.services.vat.services.vat;


import com.sodatech.services.vat.client.VatServiceClient;
import com.sodatech.services.vat.client.VatServiceClientImpl;
import com.sodatech.services.vat.generated.CheckVatResponse;
import com.sodatech.services.vat.services.vat.dto.VatCheckRequest;
import com.sodatech.services.vat.services.vat.dto.VatCheckResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.ExceptionListener;

@Slf4j
@Service
public class VatCheckServiceImpl implements VatCheckService {
    // TODO Constructor with VatServiceClient

    private final VatServiceClient vatServiceClient;

    //Wurde generiert add Constructor parameter
    @Autowired
    public VatCheckServiceImpl(VatServiceClientImpl vatServiceClient) {
        this.vatServiceClient = vatServiceClient;
    }

    //public interface VatCheckService {
    // void checkVat (VatCheckRequest checkRequest);
    //public abstract VatServiceClient<VatCheckService> getVatCheckService();
    // }

    @Override
    public VatCheckResponse checkVat(VatCheckRequest checkRequest) throws VatServiceUnauthorizedException {   //Throw Exception.....//
        // TODO Injected VAT Service Client call, then check results, then map results
        //  to VatCheckResponse
        VatCheckResponse serviceResponse = new VatCheckResponse();
        final CheckVatResponse vatSoapClientResponse;

        try {
            vatSoapClientResponse = this.vatServiceClient.validateVatUsingSoapService(checkRequest.getCountryCode(), checkRequest.getVatId());
            serviceResponse.setValid(vatSoapClientResponse.isValid());
            serviceResponse.setRequestDate(vatSoapClientResponse.getRequestDate().toGregorianCalendar().getTime());
            serviceResponse.setVatNumber(vatSoapClientResponse.getVatNumber());
            serviceResponse.setCountryCode(vatSoapClientResponse.getCountryCode());
        } catch (com.sodatech.services.vat.client.VatServiceClientUnauthorizedException e) {
            e.printStackTrace();
        }

        return serviceResponse;
    }
}