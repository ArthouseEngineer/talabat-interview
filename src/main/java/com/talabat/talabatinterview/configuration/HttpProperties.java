package com.talabat.talabatinterview.configuration;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@Builder
@ConfigurationProperties(prefix = "http")
public class HttpProperties {
    private final String visaEndpoint;

}
