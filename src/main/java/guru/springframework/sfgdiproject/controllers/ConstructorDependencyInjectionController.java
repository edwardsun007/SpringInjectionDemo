package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorDependencyInjectionController {
    // Using private final is recommended
    // ONce it is initiated it cannot be changed again , which is what we want
    private final GreetingService greetingService;
    @Autowired // autowired is optional because start from Spring v4 it automatically finds it
    public ConstructorDependencyInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
