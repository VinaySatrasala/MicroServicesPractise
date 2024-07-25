package com.vks.microservice.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ControllerRest {
    @GetMapping
    public String get(){
        return "Hello Vinay!";
    }
}
