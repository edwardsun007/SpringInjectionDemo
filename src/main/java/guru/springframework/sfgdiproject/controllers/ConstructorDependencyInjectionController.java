package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingService;

public class ConstructorDependencyInjectionController {
    // Using private final is recommended
    // ONce it is initiated it cannot be changed again , which is what we want
    private final GreetingService greetingService;

    public ConstructorDependencyInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
