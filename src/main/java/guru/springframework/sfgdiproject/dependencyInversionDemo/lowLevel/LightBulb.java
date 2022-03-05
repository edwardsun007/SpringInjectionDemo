package guru.springframework.sfgdiproject.dependencyInversionDemo.lowLevel;

import guru.springframework.sfgdiproject.dependencyInversionDemo.highLevel.Switchable;

/*
* Low Level CONCRETE class
* */
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
