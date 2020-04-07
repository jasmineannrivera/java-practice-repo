package javareview;
// One day we will want to repair more than just computers
// Create an interface for electronics
// It should be named Electronic and have two methods turnOn() and turnOff() that don't return anything
// Have the Computer object implement the Electronics interface
// Implement all the methods from the interface
// Anytime a computer's isPowerOn boolean is changed from false to true
// there needs to be a 20% chance that the isBroken property is changed to false if it is currently true.
public class Computer implements Electronic {
    private String computerName;
    private boolean isPowerOn;
    private boolean isBroken;

    public Computer(String newComputerName, boolean newIsPowerOn, boolean newIsBroken) {
        this.computerName = newComputerName;
        this.isPowerOn = newIsPowerOn;
        this.isBroken = newIsBroken;
    }

    public void turnOn(){
        if (this.isBroken && !this.isPowerOn){
            this.isPowerOn = true;
            int chanceToFix = (int) Math.floor(Math.random() * 5);
            if(chanceToFix == 2) {
                this.isBroken = false;
            }
        } else {
            this.isPowerOn = true;
        }
    }

    public void turnOff(){
        this.isPowerOn = false;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public boolean isBroken() {
        return isBroken;
    }


}
