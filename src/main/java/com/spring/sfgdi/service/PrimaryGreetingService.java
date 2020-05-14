package com.spring.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello from the PRIMARY Greeting Service";
    }
}
