package edu.poniperro.administrator;
import edu.poniperro.targets.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TasksTest {
    
    @Test
    public void presenceOfTarget() {
        Tasks tasks = new Tasks();
        Vehicle vehicle = new Vehicle();

        tasks.setTarget(vehicle);

        assertEquals(true, tasks.getTarget().isPresent());
        assertEquals(false, tasks.getTarget().isEmpty());

    }


}   
