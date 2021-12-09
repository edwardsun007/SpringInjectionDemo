package guru.springframework.sfgdiproject.dependencyInversionDemo.highLevel;

/*This interface together with interface Switches grant flexibility to plugin any types of switches
* any switchable devices in the application can implement this interface and provide their own functionality.
* */
public interface Switchable {
    void turnOn();
    void turnOff();
}
