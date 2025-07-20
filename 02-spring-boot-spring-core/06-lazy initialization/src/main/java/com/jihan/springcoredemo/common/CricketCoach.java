package com.jihan.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "cricket return 15 min bowling";
    }
}
