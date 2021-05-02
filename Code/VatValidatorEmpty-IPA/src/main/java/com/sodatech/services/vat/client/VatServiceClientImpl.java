package com.sodatech.services.vat.client;

import com.sodatech.services.vat.generated.CheckVat;
import com.sodatech.services.vat.generated.CheckVatResponse;
//import com.sedate.services.vat.generated.ObjectFactory;

import com.sun.research.ws.wadl.ObjectFactory;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceTransportException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class VatServiceClientImpl extends WebServiceGatewaySupport implements VatServiceClient {

    private final ObjectFactory objectFactory = new ObjectFactory();

    //public CheckVatResponse validateVatUsingSoapService(String countryCode, String vatNumber) {
    public CheckVatResponse validateVatUsingSoapService(String countryCode, String vatNumber) throws VatServiceClientUnauthorizedException {
        CheckVat getCheckVat = new CheckVat();
        getCheckVat.setCountryCode(countryCode);
        getCheckVat.setVatNumber(vatNumber);

        CheckVatResponse response;
        try {
            response = (CheckVatResponse) getWebServiceTemplate().
                    marshalSendAndReceive("https://ec.europa.eu/taxation_customs/vies/services/checkVatService", getCheckVat, new SoapActionCallback(""));
        }
        catch (WebServiceTransportException e) {
            //if (e.getMessage() != null && e.getMessage().contains("401") ){
                throw new VatServiceClientUnauthorizedException(e);
           // }

        }
        //catch (WebServiceGatewaySupport b){
            //if (e.getMessage() != null && e.getMessage().contains("403") ){
            //throw new VatServiceClientUnauthorizedException(b);
        //}



        return response;

    }

}
