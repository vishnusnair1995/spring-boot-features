package com.springbootfeatures.jdbc.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/user")
    public String getUseResponse() {
        return "welcome user";
    }

    @GetMapping("/admin")
    public String getAdminResponse() {
        return "welcome admin";
    }

    public String getGuestResponse() {
        return "welcome Guest";

    }
}
