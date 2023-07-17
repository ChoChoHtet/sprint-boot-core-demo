package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterInjectionController {
    private Coach myCoach;

    /**
     * define setter injection
     * can give any method name you want
     */
    @Autowired
    public void setMyCoach(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/cricket")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
