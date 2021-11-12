package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;

import java.sql.*;
import java.util.List;

public class testManejoPersonas {
    public static void main(String[] args) {
        /*PersonaDAO personaDAO = new PersonaDAO();*/

        //Insertando un nuevo objeto de tipo persona
        /*Persona personaNueva = new Persona("Luis Eduardo", "Flores", "test6@test.com", "55443322");
        personaDAO.insertar(personaNueva);*/

        //Actualizar un objeto de persona existente
         /*Persona personaModificar = new Persona(5, "Juan Carlos", "Esparza", "jcesparza@gmai.com", "5544332211");
         personaDAO.actualizar(personaModificar);*/

        //Eliminar un registro
       /* Persona personaEliminar = new Persona(5);
        personaDAO.eliminar(personaEliminar);*/

        //Listado
      /*  List<Persona> personas = personaDAO.seleccionar();

        for (Persona persona : personas){
            System.out.println("Persona: " + persona );
        }*/
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
            if (connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }

            PersonaDAO personaDAO = new PersonaDAO(connection);
            Persona updatePersona = new Persona(2);
            updatePersona.setNombre("Karla Ivon");
            updatePersona.setApellido("Gomez");
            updatePersona.setEmail("test@test.com");
            updatePersona.setTelefono("1122334455");
            personaDAO.actualizar(updatePersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Ramirez");
            personaDAO.insertar(nuevaPersona);

            connection.commit();


        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
    }
}
