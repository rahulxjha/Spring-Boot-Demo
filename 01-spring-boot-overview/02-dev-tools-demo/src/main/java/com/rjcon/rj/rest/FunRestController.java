package com.rjcon.rj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run Daily";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }

    @GetMapping("/motivation")
    public String getDailyMotivation(){
        return "Always remember why have you started!";
    }

    @GetMapping("/task")
    public String getDailyTask(){
        return "You have to buy vegetables.";
    }
    
}
