package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * video 34 DI without Spring
 * */
@Controller
public class PropertyInjectedController {
    // the qualifier is using the exact className of service with the first character as lowerCase
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    // injected interface is this one
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
