package javareview;
// One day we will want to repair more than just computers
// Create an interface for electronics
// It should be named Electronic and have two methods turnOn() and turnOff() that don't return anything
// Have the Computer object implement the Electronics interface
// Implement all the methods from the interface
// Anytime a computer's isPowerOn boolean is changed from false to true
// there needs to be a 20% chance that the isBroken property is changed to false if it is currently true.
public interface Electronic {

    public void turnOn();

    public void turnOff();

}
