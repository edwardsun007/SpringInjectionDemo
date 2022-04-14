package guru.springframework.sfgdiproject.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component // by default Spring knows that scope is a singleton without sepcifying it
public class SingletonBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingletonBean(){
        System.out.println("Creating a Signleton bean!!!");
    }
    public String getMyScope(){
        return "I'm a Singleton.";
    }
}
