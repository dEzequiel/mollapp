package edu.poniperro.targets;

public class Vehicle implements Target {
    public Vehicle(){};

    @Override
    public void execute(String id) {
        System.out.print("Door open for " + id.toString());
    }
    
}
