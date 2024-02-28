package com.talabat.talabatinterview.service;

import com.talabat.talabatinterview.configuration.HttpProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class VisaService {

    private final RestTemplate template;

    private final HttpProperties properties;

    public String createVisa(long userId) {
        ResponseEntity<String> response = template.postForEntity(properties.getVisaEndpoint() + "/visa/request?userId=" + userId,
                null,
                String.class);
        return response.getBody();
    }
}
