package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class testManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        //Insertando un nuevo objeto de tipo persona
        /*Persona personaNueva = new Persona("Luis Eduardo", "Flores", "test6@test.com", "55443322");
        personaDAO.insertar(personaNueva);*/

        //Actualizar un objeto de persona existente
         /*Persona personaModificar = new Persona(5, "Juan Carlos", "Esparza", "jcesparza@gmai.com", "5544332211");
         personaDAO.actualizar(personaModificar);*/

        //Eliminar un registro
        Persona personaEliminar = new Persona(5);
        personaDAO.eliminar(personaEliminar);

         //Listado
        List<Persona> personas = personaDAO.seleccionar();

        for (Persona persona : personas){
            System.out.println("Persona: " + persona );
        }
    }
}
