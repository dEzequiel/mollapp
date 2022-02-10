package edu.poniperro.clients;

import edu.poniperro.administrator.ProgrammerTasks;

public class Mollap implements Client{
    
    private ProgrammerTasks programmer;

    @Override
    public void setProgrammerTask(ProgrammerTasks programmer) {
        this.programmer = programmer;
    }

    @Override
    public void sendRequest(String id) {
        this.programmer.execute(id);
    }
}
