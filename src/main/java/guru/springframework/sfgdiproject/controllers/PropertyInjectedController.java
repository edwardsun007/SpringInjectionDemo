package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingService;
/**
 * video 34 DI without Spring
 * */
public class PropertyInjectedController {
    // injected interface is this one
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
