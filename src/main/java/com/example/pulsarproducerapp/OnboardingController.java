package com.example.pulsarproducerapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/onboard")
public class OnboardingController {

    @PostMapping
    public ResponseEntity<Void> approveEngineer(@RequestParam("engineerId") Long engineerId) {
        return ResponseEntity.badRequest().build();
    }

}
