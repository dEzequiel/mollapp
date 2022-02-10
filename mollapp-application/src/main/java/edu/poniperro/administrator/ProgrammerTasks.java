package edu.poniperro.administrator;

import java.util.List;

import edu.poniperro.filter.Filtre;
import edu.poniperro.targets.Target;

public class ProgrammerTasks implements TaskActions{
    
    private Tasks tasksmanagement = new Tasks();

    public ProgrammerTasks(Target vehicle) {
        this.tasksmanagement.setTarget(vehicle);
    }

    // Method for testing purpose.
    public List<Filtre> getTasks() {
        return this.tasksmanagement.getTasks();
    }

    @Override
    public void addTask(Filtre task) {
        this.tasksmanagement.addTask(task);
    }

    public void execute(String message) {
        for(Filtre task : this.tasksmanagement.getTasks()) {task.execute(message);}

        if(this.tasksmanagement.getTarget().isPresent()) {
            this.tasksmanagement.getTarget().get().execute(message);
        } else {
            System.out.print("Vehicle not free!");
        }
    }

    
}
