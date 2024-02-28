package com.talabat.talabatinterview.service;

import com.talabat.talabatinterview.configuration.HttpProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VisaServiceTest {
    @Mock
    RestTemplate template;
    @Mock
    HttpProperties properties = HttpProperties.builder()
            .visaEndpoint("http://visa-service/")
            .build();
    @InjectMocks
    VisaService target;

    @Test
    void should_call_external_visa_service() {

        //given
        when(properties.getVisaEndpoint()).thenReturn("http://visa-service/");
        when(template.postForEntity(
                "http://visa-service/visa/request?userId=0",
                null,
                String.class
        ))
                .thenReturn(ResponseEntity.ok("ticket-1"));

        //when
        target.createVisa(0);

    }

}