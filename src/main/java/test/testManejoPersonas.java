package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class testManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        List<Persona> personas = personaDAO.seleccionar();

        for (Persona persona : personas){
            System.out.println("Persona: " + persona );
        }


    }
}
