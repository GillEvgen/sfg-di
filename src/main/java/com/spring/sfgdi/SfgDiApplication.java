package com.spring.sfgdi;

import com.spring.sfgdi.controllers.FirstController;
import com.spring.sfgdi.controllers.GreetingController;
import com.spring.sfgdi.controllers.I18NController;
import com.spring.sfgdi.controllers.PetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println(petController.getPet());
        System.out.println("---------------------------------------------------------");


        FirstController firstController = (FirstController) ctx.getBean("firstController");
        System.out.println("---------------------------Primary Greeting");
        System.out.println(firstController.sayHello());

        System.out.println("---------------------------Profile");
        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
        System.out.println(i18NController.sayHello());

        System.out.println("---------------------------Service");


        System.out.println("---------------------------Greeting");
        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        System.out.println(greetingController.helloGreeting());
    }

}
