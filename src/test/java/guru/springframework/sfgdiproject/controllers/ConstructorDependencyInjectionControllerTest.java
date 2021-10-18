package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorDependencyInjectionControllerTest {

    ConstructorDependencyInjectionController controller;

    @BeforeEach
    void setUp() {
        // Notice here we are initiating using constructor
        controller = new ConstructorDependencyInjectionController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}