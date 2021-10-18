package guru.springframework.sfgdiproject.services;

/**
 * Created by Edward
 */
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
