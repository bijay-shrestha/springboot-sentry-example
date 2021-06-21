package com.bijay.springbootsentryexample;

import io.sentry.spring.EnableSentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSentryExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSentryExampleApplication.class, args);
    }

}
