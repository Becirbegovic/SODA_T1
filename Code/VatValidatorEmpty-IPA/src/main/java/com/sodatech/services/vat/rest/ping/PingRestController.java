package com.sodatech.services.vat.rest.ping;

import com.sodatech.services.vat.rest.ping.dto.PingResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The {@link PingRestController} provides the version and a standard "pong" response.
 * The idea behind this controller is to simulate a health check.
 *
 * @author jp
 */
@RestController
@RequestMapping(value = "/v1/ping", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Ping", description = "Ping/Version info")
@Slf4j
public class PingRestController {
    /**
     * Response constant.
     */
    private static final String RESPONSE = "pong";
    /**
     * Version constant.
     */
   // @Value("${info.app.version}")
    private String version = "1.0.0";

    /**
     * Returns the static RESPONSE object.
     *
     * @return PingResponse containing the version and the standard "pong" response.
     */
    @GetMapping
    public ResponseEntity<PingResponse> ping(@Parameter(hidden = true) @RequestHeader(value = "geoip_country_code", required = false) final String countryCode) {
        final PingResponse response = new PingResponse(version, RESPONSE, (StringUtils.isBlank(countryCode) ? "-" : countryCode));
        return ResponseEntity.ok(response);
    }
}
