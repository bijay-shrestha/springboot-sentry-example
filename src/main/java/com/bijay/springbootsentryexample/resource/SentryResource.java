package com.bijay.springbootsentryexample.resource;

import io.sentry.Sentry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test/")
public class SentryResource {

    @GetMapping
    public String test() {
        return "Application is running mother!";
    }

    @GetMapping("sentry")
    public String sentry() {
        log.info("Entering Sentry method .. ");
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return "Babbal bhaira cha lah!";
    }
}
