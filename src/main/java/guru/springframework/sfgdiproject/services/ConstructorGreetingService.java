package guru.springframework.sfgdiproject.services;

import org.springframework.stereotype.Service;

/**
 * Created by Edward
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
