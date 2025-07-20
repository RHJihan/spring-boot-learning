package com.jihan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("BaseballCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "baseball return 15 min bowling";
    }
}
