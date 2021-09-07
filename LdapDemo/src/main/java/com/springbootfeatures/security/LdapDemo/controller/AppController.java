package com.springbootfeatures.security.LdapDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class AppController {

    private final static Logger logger = LoggerFactory.getLogger(AppController.class);
    @GetMapping("/")
    public String returnText() {
        return "Home Page";

    }


}