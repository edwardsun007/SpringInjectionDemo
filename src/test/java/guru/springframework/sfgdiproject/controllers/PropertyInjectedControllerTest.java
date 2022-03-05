package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
        controller = new PropertyInjectedController();
        // This is the least recommended approach of D.I.
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}