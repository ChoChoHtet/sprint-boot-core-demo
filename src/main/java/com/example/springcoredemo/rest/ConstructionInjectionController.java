package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructionInjectionController {

    private Coach myCoach;

    //define a constructor for dependency injection
    @Autowired
    public ConstructionInjectionController(@Qualifier("baseballCoach") Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/baseball")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
