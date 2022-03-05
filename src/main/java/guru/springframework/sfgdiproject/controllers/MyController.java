package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingService;
import org.springframework.stereotype.Controller;

/*
*
* */
@Controller
public class MyController {

    private final GreetingService greetingService;

    // constructor injection is preferred and we don't need to use Autowire
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayGreeting();
    }
}
