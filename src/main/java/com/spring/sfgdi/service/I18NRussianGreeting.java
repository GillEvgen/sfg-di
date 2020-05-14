package com.spring.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("RU")
@Service("i18nService")
public class I18NRussianGreeting implements GreetingService {

    @Override
    public String getGreeting() {
        return "Привет Мир - RU";
    }
}
