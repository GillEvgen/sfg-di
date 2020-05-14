package com.spring.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello from the greeting Service";
    }
}
