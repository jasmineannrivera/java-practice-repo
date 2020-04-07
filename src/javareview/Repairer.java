package javareview;

import java.util.ArrayList;

// Our final class is Repairer that extends Human
// The Repairer repairs computers and should have a method called repairComputer()
// repairComputer should take in two arguments that are both ArrayLists.
// One ArrayList should be a list of broken computers for the Repairer to take from
// The other ArrayList should be a list of fixed computers for the Repairer to put the computer once it works.
// When repairComputer is called the Repairer should take a computer from the broken pile, fix it and put it in the fixed pile.
// Remember that there is not a setter for isBroken so the Repairer has to figure something else out.
public class Repairer extends Human {

    public Repairer(String name) {
        super(name);
    }
    //not static cause repairer can work anywhere
    public void repairComputer(ArrayList<Computer> thisStoresBrokenPile, ArrayList<Computer> thisStoresFixedPile){
        if (!thisStoresBrokenPile.isEmpty()) {
            Computer computerToBeFixed = thisStoresBrokenPile.get(0);
            while (computerToBeFixed.isBroken()){
                computerToBeFixed.turnOff();
                computerToBeFixed.turnOn();
            }
            thisStoresBrokenPile.remove(0);
            thisStoresFixedPile.add(computerToBeFixed);
        }else {
            System.out.println("I guess I'm done");
        }
    }
}
