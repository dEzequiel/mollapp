package edu.poniperro;


import edu.poniperro.administrator.ProgrammerTasks;
import edu.poniperro.clients.Mollap;
import edu.poniperro.targets.Vehicle;
import edu.poniperro.filter.*;

/**
 * Hello world!
 *
 */
public class Mollapp
{
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */


        ProgrammerTasks programadorTasques = new ProgrammerTasks(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */

        programadorTasques.addTask(new Authentication());
        programadorTasques.addTask(new Authorization());


        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollap client = new Mollap();
        client.setProgrammerTask(programadorTasques);
        client.sendRequest("Francesc");
    }
}

