package guru.springframework.sfgdiproject.config;

import com.springframework.factoryPattern.PetService;
import com.springframework.factoryPattern.PetServiceFactory;
import guru.springframework.sfgdiproject.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdiproject.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdiproject.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfg-di-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory(); // treated as import 3rd party Lib here and make this a bean
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetServices("dog");
    }

    @Profile("cat")
    @Bean // always make sure to annotate with Bean ! otherwise you see error that -- PetController required a bean of type 'com.springframework.factoryPattern.PetService' that could not be found.
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetServices("cat");
    }

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

//    @Bean  Originally use Spring annotation the code is this, now it is using XML configuration
//    ConstructorGreetingService constructorGreetingService(){
//        return new ConstructorGreetingService();
//    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }
}
