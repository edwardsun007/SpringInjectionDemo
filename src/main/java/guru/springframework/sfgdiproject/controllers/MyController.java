package guru.springframework.sfgdiproject.controllers;

import org.springframework.stereotype.Controller;

/*
*
* */
@Controller
public class MyController {
    public String sayHi(){
        System.out.println("Hello world!");;
        return "Hi !";
    }
}
