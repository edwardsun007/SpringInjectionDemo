package guru.springframework.sfgdiproject.dependencyInversionDemo.lowLevel;

import guru.springframework.sfgdiproject.dependencyInversionDemo.highLevel.Switchable;

/*
 * High Level CONCRETE class
 * */
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan pressed:  start spinning....");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan pressed:  stops spinning....");
    }
}
