package com.springbootfeatures.docker.springbootdocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/{name}")
    public ResponseEntity<String> askQuestion(@PathVariable(value = "name") String name) {
        return ResponseEntity.ok("Hey " + name + ", do you like banana pudding?");
    }
}

