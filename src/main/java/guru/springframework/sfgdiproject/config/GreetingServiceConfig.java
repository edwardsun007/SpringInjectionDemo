package guru.springframework.sfgdiproject.config;

import guru.springframework.sfgdiproject.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdiproject.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdiproject.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    // English i18nService is also the name for the Qualifier in i18nController
    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanish() { /* NOTE Java doesn't allow class name is same as the method name here
     In order to let Spring know that it should use i18nSpanishGreeting, you need to give the bean name by using @Bean( " " )
    */
        return new I18nSpanishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    };
    // Spring create object of ConstructorGreetingService and manage it as bean
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }
}
