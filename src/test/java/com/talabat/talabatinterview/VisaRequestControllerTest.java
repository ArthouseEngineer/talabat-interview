package com.talabat.talabatinterview;

import com.talabat.talabatinterview.service.VisaService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

public class VisaRequestControllerTest extends BaseControllerTest {

    @MockBean
    private VisaService visaService;

    @Test
    void should_accept_user_id_and_return_OK() {

        //when
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(
                "/visa/request?userId=0000",
                null,
                String.class
        );

        //then
        Assertions.assertThat(responseEntity.getStatusCode())
                .isEqualTo(HttpStatus.OK);

    }


    @Test
    void should_return_ticket_number() {

        //given
        when(visaService.createVisa(0)).thenReturn("ticket-0");

        //when
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(
                "/visa/request?userId=0",
                null,
                String.class
        );

        //then
        Assertions.assertThat(responseEntity.getBody())
                .isEqualTo("ticket-0");
    }

}
