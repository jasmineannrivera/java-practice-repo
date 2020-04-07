package javareview;

import java.util.ArrayList;
// BranceTech.java is our store and where everything happens
// It needs to have 2 static properties that are both ArrayLists of computers
// One ArrayList should be named brokenComputers and the other should be named fixedComputers

// Does this work?
// Add two more static properties in BranceTech.java
// Make one Clerk and one Repairer
// Make some computers in BranceTech.java main method and call the clerk's receive computer method
// over and over again and pass the computers to it one at a time.
// The broken pile should have all the computers given to the clerk.
// Everytime the repairer's repairComputer method is called a computer should be taken from the brokenPile and put into the fixedPile
// with the isBroken property set to false.
public class JasmineTech {

    //static because there won't be any instances
    private static ArrayList<Computer> brokenComputers = new ArrayList<>();
    private static ArrayList<Computer> fixedComputers = new ArrayList<>();

    private static Clerk brance = new Clerk("Brance");
    private static Repairer johnny = new Repairer("Johnny");


    public static void main(String[] args) {
        Computer testComputerOne = new Computer("Dell", false, true);
        Computer testComputerTwo = new Computer("Alienware", false, true);
        Computer testComputerThree = new Computer("Lapple", false, true);

        brance.receiveComputer(testComputerOne, brokenComputers);
        brance.receiveComputer(testComputerTwo, brokenComputers);
        brance.receiveComputer(testComputerThree, brokenComputers);

       for(Computer computer : brokenComputers) {
           System.out.println(computer.getComputerName());
       }

       johnny.repairComputer(brokenComputers, fixedComputers);
       johnny.repairComputer(brokenComputers, fixedComputers);
        System.out.println("--------");
        for(Computer computer : brokenComputers) {
            System.out.println(computer.getComputerName());
        }
        System.out.println("--------");
        for(Computer computer : fixedComputers) {
            System.out.println(computer.getComputerName());
        }

    }
}

// One day we will want to repair more than just computers
// Create an interface for electronics
// It should be named Electronic and have two methods turnOn() and turnOff() that don't return anything
// Have the Computer object implement the Electronics interface
// Implement all the methods from the interface
// Anytime a computer's isPowerOn boolean is changed from false to true
// there needs to be a 20% chance that the isBroken property is changed to false if it is currently true.