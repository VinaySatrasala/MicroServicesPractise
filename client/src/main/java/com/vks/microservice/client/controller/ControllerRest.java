package com.vks.microservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1")
public class ControllerRest {
    
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> getMethodName(@RequestParam String param) {

        String uri = "http://localhost:8070/";
        return null;
    }
    
}
