package com.talabat.talabatinterview.controller;

import com.talabat.talabatinterview.service.VisaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visa")
@RequiredArgsConstructor
public class VisaRequestController {

    private final VisaService visaService;

    @PostMapping("/request")
    public ResponseEntity<String> createNewVisa(@RequestParam long userId) {

        String ticketID = visaService.createVisa(userId);
        return ResponseEntity.ok(ticketID);
    }

}
