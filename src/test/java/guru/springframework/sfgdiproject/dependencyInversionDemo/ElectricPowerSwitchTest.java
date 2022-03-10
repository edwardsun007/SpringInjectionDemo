package guru.springframework.sfgdiproject.dependencyInversionDemo;

import guru.springframework.sfgdiproject.dependencyInversionDemo.highLevel.Switchable;
import guru.springframework.sfgdiproject.dependencyInversionDemo.lowLevel.Fan;
import guru.springframework.sfgdiproject.dependencyInversionDemo.lowLevel.LightBulb;
import org.junit.jupiter.api.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        // Test on Fan class
        Switchable switchableFan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(switchableFan);
        fanSwitch.press();
        fanSwitch.press();
    }
}
