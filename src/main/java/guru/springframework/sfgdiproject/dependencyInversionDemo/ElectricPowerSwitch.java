package guru.springframework.sfgdiproject.dependencyInversionDemo;

import guru.springframework.sfgdiproject.dependencyInversionDemo.highLevel.Switchable;

public class ElectricPowerSwitch implements Switch {
    // I don't care which client it is besides that it  IS Switchable Type
    /* Loose coupling example here:
    *  Note client is NOT concrete class,  to do loose coupling, use abstract class or interface
    * */
    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn){
            client.turnOff();
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}
