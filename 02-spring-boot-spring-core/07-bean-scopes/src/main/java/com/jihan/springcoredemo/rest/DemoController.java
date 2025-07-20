package com.jihan.springcoredemo.rest;

import com.jihan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier ("baseballCoach") Coach theCoach,
                          @Qualifier ("baseballCoach") Coach theAnotherCoach) {
        System.out.println("DemoController constructor");
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkDailyWorkout() {
        return "Comparing Beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
