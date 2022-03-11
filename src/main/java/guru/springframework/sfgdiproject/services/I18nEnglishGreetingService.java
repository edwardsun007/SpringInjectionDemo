package guru.springframework.sfgdiproject.services;

import guru.springframework.sfgdiproject.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.englishGreetingRepository.getGreeting(); // original video 75 has mistake, we need to actually use the
        // repository we created by calling it
    }
}
