package edu.poniperro.filter;

public class Authorization implements Filtre{
    
    public Authorization(){};

    @Override
    public void execute(String id) {
        System.out.print("Authorization OK for " + id.toString() + '\n');
    }

}
