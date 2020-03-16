package com.thusitha.webservice01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontwebserviceApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}