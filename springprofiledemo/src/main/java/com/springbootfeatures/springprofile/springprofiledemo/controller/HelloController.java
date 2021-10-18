package com.springbootfeatures.springprofile.springprofiledemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @Value("${spring.message}")
    public String message;
    @GetMapping(value = "/rest")
    public String message() {
        return message;
    }

}
