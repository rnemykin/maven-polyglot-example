package com.rnemykin.examples.mvnpolyglot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @GetMapping
    public String greeting(@RequestParam String name) {
        return "Hi " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}