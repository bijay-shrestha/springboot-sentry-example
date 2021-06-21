package com.bijay.springbootsentryexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SentryResource {

    @GetMapping
    public String test() {
        return "Application is running mother!";
    }
}
