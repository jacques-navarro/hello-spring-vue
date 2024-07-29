package dev.passingarguments.vue_hello.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
