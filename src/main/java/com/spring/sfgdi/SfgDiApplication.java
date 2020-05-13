package com.spring.sfgdi;

import com.spring.sfgdi.controllers.FirstController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        FirstController firstController = (FirstController) ctx.getBean("firstController");

        String greeting = firstController.sayHello();
        System.out.println(greeting);

        String hello = firstController.sayGoodBye();
        System.out.println(hello);
    }

}
