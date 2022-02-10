package edu.poniperro.clients;

import edu.poniperro.administrator.ProgrammerTasks;

public interface Client {
    void setProgrammerTask(ProgrammerTasks task);
    void sendRequest(String id);
}
