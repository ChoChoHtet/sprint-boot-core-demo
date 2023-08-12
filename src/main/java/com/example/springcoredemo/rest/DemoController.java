package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach coach){
        System.out.println("In constructor: "+getClass().getSimpleName());
        myCoach = coach;
    }

    @GetMapping("/demo")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
