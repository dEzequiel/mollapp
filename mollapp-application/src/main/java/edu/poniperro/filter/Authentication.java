package edu.poniperro.filter;

public class Authentication implements Filtre{

    public Authentication(){};

    @Override
    public void execute(String id) {
        System.out.print("Authentication OK for " + id.toString() + '\n');
    }
}
