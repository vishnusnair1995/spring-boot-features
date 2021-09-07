package com.spirngbootfeatures.consumingrest.ConsumingRest.controller;

import com.spirngbootfeatures.consumingrest.ConsumingRest.model.MockData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {
    private Logger logger = LoggerFactory.getLogger(DataController.class);
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getData")
    public MockData jsonData() {
        MockData mockData = restTemplate.getForObject(
                "https://gorest.co.in/public/v1/posts", MockData.class);
        return mockData;
    }
}
