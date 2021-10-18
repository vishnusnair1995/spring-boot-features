package com.springbootfeatures.security.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/security")
@RestController
public class SecurityController {
    @GetMapping("/user")
    public String welcomeUser() {
        return "welcome user";
    }

    @GetMapping("/admin")
    public String welcomeAdmin() {
        return "welcoem admin";
    }

    @GetMapping("guest")
    public String welcomeGuest() {
        return "welcome guest";
    }

}
