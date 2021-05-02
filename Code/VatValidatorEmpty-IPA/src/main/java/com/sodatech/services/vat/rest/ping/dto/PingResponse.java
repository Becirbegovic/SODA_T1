package com.sodatech.services.vat.rest.ping.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Simple Response for a ping request.
 *
 * @author jp
 */
@Data
@AllArgsConstructor
@Schema(description = "Service version info.", name = "PingResponse")
public class PingResponse {
    /**
     * Version of the API.
     */
    @Schema(description = "Version of the service.", required = true)
    private String version;
    /**
     * Response (usually "pong").
     */
    @Schema(description = "Response (usually 'pong').", required = true)
    private String response;
    /**
     * Country code of the originating request.
     * This requires a proper geo ip database to be used.
     */
    @Schema(description = "Detected country (optional).")
    private String countryCode;
}
