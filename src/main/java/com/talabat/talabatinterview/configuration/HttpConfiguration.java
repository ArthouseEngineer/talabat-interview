package com.talabat.talabatinterview.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class HttpConfiguration {

    @Bean
    public RestTemplate visaRestTemplate() {
        return new RestTemplateBuilder().build();
    }

}
