package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class testManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        //Insertando un nuevo objeto de tipo persona
        Persona personaNueva = new Persona("Luis Eduardo", "Flores", "test6@test.com", "55443322");
        personaDAO.insertar(personaNueva);


        List<Persona> personas = personaDAO.seleccionar();

        for (Persona persona : personas){
            System.out.println("Persona: " + persona );
        }
    }
}
