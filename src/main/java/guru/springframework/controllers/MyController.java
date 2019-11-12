package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller

public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello Sajjad From MyController!!! ");

        return greetingService.sayGreeting();
    }
}