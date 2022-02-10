package edu.poniperro.administrator;

import edu.poniperro.filter.Filtre;
import edu.poniperro.targets.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tasks implements TaskActions{

    public Tasks(){};

    private List<Filtre> tasks = new ArrayList<>();
    private Optional<Target> target;

    public List<Filtre> getTasks() {
        return this.tasks;
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    @Override
    public void addTask(Filtre task) {
        this.tasks.add(task);
    }

    



    
}
