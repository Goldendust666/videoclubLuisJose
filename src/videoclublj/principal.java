/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videoclublj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<Pelicula> pelicula = new ArrayList<>();
         Pelicula pel1= new Pelicula(1,"El Padrino","Francis For Coppola");
        pelicula.add(pel1);
        Pelicula pel2= new Pelicula(2,"Los chicos del coro","Christophe Barratier");
        pelicula.add(pel2);
        Pelicula pel3= new Pelicula(3,"Lo imposible","Juan Antonio Bayona");
        pelicula.add(pel3);
        Pelicula pel4= new Pelicula(4,"Diario de Noa","Nick Cassavetes");
        pelicula.add(pel4);
        Pelicula pel5= new Pelicula(5,"Mas allá de la vida","Clint Eastwood");
        pelicula.add(pel5);
        Pelicula pel6= new Pelicula(6,"La gran familia","Fernando Palacios");
        pelicula.add(pel6);
        Pelicula pel7= new Pelicula(7,"El curioso caso de Benjamin Button","David Fincher");
        pelicula.add(pel7);
        Pelicula pel8= new Pelicula(8,"Campeones","Javier Fesser");
        pelicula.add(pel8);
        Pelicula pel9= new Pelicula(9,"A todo tren. Destino Asturias","Santiago Segura");
        pelicula.add(pel9);
        Pelicula pel10= new Pelicula(10,"Veneciafrenia","Alex de la Iglesia");
        pelicula.add(pel10);
        List<Cliente> cliente = new ArrayList<>();
    }
    
}
