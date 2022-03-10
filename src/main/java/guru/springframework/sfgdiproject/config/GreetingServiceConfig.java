package guru.springframework.sfgdiproject.config;

import guru.springframework.sfgdiproject.services.ConstructorGreetingService;
import guru.springframework.sfgdiproject.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdiproject.services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

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
