package com.spring.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18NEnglishGreeting implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
