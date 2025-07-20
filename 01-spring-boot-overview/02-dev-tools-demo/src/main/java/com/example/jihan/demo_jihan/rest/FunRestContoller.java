package com.example.jihan.demo_jihan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestContoller {
    // expose / that return hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose /workout
    @GetMapping("/workout")
    public String getWorkout() {
        return "Daily workout!";
    }
}
