package com.spring.sfgdi.controllers;

import com.spring.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(@Qualifier("primaryGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String helloGreeting(){
       return greetingService.getGreeting();
    }
}
