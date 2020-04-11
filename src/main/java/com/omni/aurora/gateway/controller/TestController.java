package com.omni.aurora.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("teste")
@RestController
public class TestController {

    @GetMapping
    public String test() {
        return "Thats work";
    }
}
