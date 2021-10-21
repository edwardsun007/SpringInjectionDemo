package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorDependencyInjectionControllerTest {

    ConstructorDependencyInjectionController controller;

    @BeforeEach
    void setUp() {
        // Notice here we are initiating using constructor
        controller = new ConstructorDependencyInjectionController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}