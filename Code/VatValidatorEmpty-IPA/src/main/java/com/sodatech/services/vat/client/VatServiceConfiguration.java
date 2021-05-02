package com.sodatech.services.vat.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;


@Configuration
public class VatServiceConfiguration {

    @Bean
    public SaajSoapMessageFactory messageFactory() {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.setSoapVersion(SoapVersion.SOAP_12);
        return messageFactory;
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.sodatech.services.vat.generated");
        return marshaller;
    }

    @Bean
    public VatServiceClientImpl vatServiceClient(Jaxb2Marshaller marshaller) {
        VatServiceClientImpl client = new VatServiceClientImpl();
        client.setDefaultUri("https://ec.europa.eu/taxation_customs/vies/services/checkVatService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }


}
