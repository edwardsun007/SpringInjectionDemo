package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorDependencyInjectionController {
    // Using private final is recommended
    // ONce it is initiated it cannot be changed again , which is what we want
    private final GreetingService greetingService;
    @Autowired // autowired is optional because start from Spring v4 it automatically finds it
    public ConstructorDependencyInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        /*withoout qualifier , the error is
        * Could not autowire. There is more than one bean of 'GreetingService' type.
            Beans:
            constructorGreetingService   (ConstructorGreetingService.java) propertyInjectedGreetingService   (PropertyInjectedGreetingService.java
        * */
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
