package com.quaylor.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Hit 100 shots today!";
    }
}
