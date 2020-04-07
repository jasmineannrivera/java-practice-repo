package javareview;

// We need to make a Clerk class that extends Human
// The Clerk will be at the front desk to accept incoming computers
// The Clerk should have a method called receiveComputer(Computer brokeComp, ArrayList<Computer> brokenPile)
// that accepts a computer and an ArrayList
// and the Clerk puts the computer in the brokenComputer pile
// Why do we need to have an ArrayList as a parameter
// it is a static property in a different class so while working here we will need to pass array to clerk
// Can we make this work without the parameter? I'm actually asking if someone has another idea.

import java.util.ArrayList;

public class Clerk extends Human {

    public Clerk(String name) {
        super(name);
    }

    public void receiveComputer(Computer incomingBrokenComputer, ArrayList<Computer> thisStoresBrokenComputerPile){
        thisStoresBrokenComputerPile.add(incomingBrokenComputer);
    }

}
