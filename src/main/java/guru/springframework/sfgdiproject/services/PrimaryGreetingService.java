package guru.springframework.sfgdiproject.services;

import guru.springframework.sfgdiproject.services.GreetingService;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean !";
    }
}
