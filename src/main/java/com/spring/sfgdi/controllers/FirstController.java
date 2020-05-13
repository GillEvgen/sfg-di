package com.spring.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    public String sayHello() {
        System.out.println("Hello World!!!");
        return "Hi Folks";
    }

    public String sayGoodBye(){
        System.out.println("Say goodBye");
        return "Fuck the police";
    }
}
