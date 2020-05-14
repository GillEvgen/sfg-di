package com.spring.sfgdi.controllers;

import com.spring.sfgdi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHi(){
     return helloService.getHello();
    }
}
