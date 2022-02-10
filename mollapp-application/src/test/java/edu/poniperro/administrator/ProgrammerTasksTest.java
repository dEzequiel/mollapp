package edu.poniperro.administrator;
import edu.poniperro.filter.Authentication;
import edu.poniperro.filter.Authorization;
import edu.poniperro.targets.Vehicle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ProgrammerTasksTest {
    
    @Test
    public void checkIfTasksAreInsideTasksArray() {
        ProgrammerTasks programmer = new ProgrammerTasks(new Vehicle());
        programmer.addTask(new Authentication());
        programmer.addTask(new Authorization());

        assertEquals(2, programmer.getTasks().size());
    }

    // @Test
    // public void executeTasks() {
    //     ProgrammerTasks programmer = new ProgrammerTasks(new Vehicle());
    //     programmer.addTask(new Authentication());
    //     programmer.addTask(new Authorization());

    //     programmer.execute("eze");
    // }
}
