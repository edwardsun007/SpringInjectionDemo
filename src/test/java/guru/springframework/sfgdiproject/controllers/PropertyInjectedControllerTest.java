package guru.springframework.sfgdiproject.controllers;

import guru.springframework.sfgdiproject.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    public void initEach(){
        System.out.println("Before Each initEach() method called");
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println("This is the actual test content here");
    }
}