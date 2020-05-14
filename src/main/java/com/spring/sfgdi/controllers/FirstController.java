package com.spring.sfgdi.controllers;

import com.spring.sfgdi.service.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    private final PrimaryGreetingService primaryGreetingService;

    public FirstController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String sayHello() {
        return primaryGreetingService.getGreeting();
    }

}
