package com.sodatech.services.vat.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Simple configuration for the springdoc openapi 3 documentation.
 * TODO: Move actual api info elements like company name, terms, contact email, etc. into configuration file.
 *
 * @author jp
 */
@Configuration
public class OpenApiDocConfig {
    /**
     * Service description.
     */
    private static final String DESCRIPTION = "The VAT Validation service allows to check the validity of a VAT ID issued by a European Union member country.";
    /**
     * Company Name.
     */
    private static final String COMPANY_NAME = "Sodatech AG";
    /**
     * Company terms URL.
     */
    private static final String TERMS = "https://www.sodatech.com/eservices/api/terms.html";
    /**
     * License description.
     */
    private static final String LICENSE = "Company Proprietary (c) 2021 Sodatech AG, Freienbach, Switzerland";
    /**
     * License URL.
     */
    private static final String LICENSE_URL = "https://www.sodatech.com";
    /**
     * Contact Email address.
     */
    private static final String CONTACT_EMAIL = "info@sodatech.com";
    /**
     * Contact Name.
     */
    private static final String CONTACT_NAME = "Sodatech Sales";
    /**
     * Contact URL.
     */
    private static final String CONTACT_URL = "https://www.sodatech.com";
    /**
     * API Name.
     */
    private static final String API_NAME = "VAT Validator API";
    /**
     * API Version.
     */
    private static final String API_VERSION = "0.0.1";

    /**
     * Returns a customer open api configuration.
     *
     * @return a {@link OpenAPI} object representing the openapi doc configuration.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(this.createOpenApiInfo()).components(new Components());
    }

    /**
     * Creates the basic OPEN API documentation info.
     *
     * @return an {@link Info} object containing the necessary information.
     */
    private Info createOpenApiInfo() {
        return new Info().contact(this.createContactInfo()).description(DESCRIPTION).license(this.createLicenseInfo()).title(
                API_NAME).termsOfService(TERMS).version(API_VERSION);
    }

    /**
     * Creates the basic license info for this API.
     *
     * @return a {@link License} object containing the necessary information.
     */
    private License createLicenseInfo() {
        return new License().name(LICENSE).url(LICENSE_URL);
    }

    /**
     * Creates the basic contact information for this API.
     *
     * @return a {@link Contact} object containing the necessary information.
     */
    private Contact createContactInfo() {
        return new Contact().email(CONTACT_EMAIL).name(CONTACT_NAME).url(CONTACT_URL);
    }
}
