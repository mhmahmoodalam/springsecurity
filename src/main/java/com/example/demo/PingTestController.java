package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingTestController {

    @GetMapping("/ping")
    public String PingTest(){
        return "Hello  World";
    }
}
