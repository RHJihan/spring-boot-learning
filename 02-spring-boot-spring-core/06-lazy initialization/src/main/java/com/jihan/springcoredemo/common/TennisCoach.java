package com.jihan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("TennisCoach constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "tennis return 15 min bowling";
    }
}
