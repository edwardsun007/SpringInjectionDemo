package guru.springframework.sfgdiproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService") // Note this is how we give name to Spring Service
public class i18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - i18n EN !";
    }
}
