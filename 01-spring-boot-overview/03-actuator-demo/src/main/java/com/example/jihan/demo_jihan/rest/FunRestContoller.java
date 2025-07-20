package com.example.jihan.demo_jihan.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestContoller {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }

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
