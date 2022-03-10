package guru.springframework.sfgdiproject.services;

import org.springframework.stereotype.Service;

/**
 * Created by Edward
 */

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
