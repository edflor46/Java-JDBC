package test;

import datos.UsuarioDAO;

import domain.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        /*Usuarios usuario1 = new Usuarios("Lalo", "12345");
        usuarioDAO.insertar(usuario1);

        Usuarios usuario2 = new Usuarios("Luis", "12345");
        usuarioDAO.insertar(usuario2);

        Usuarios usuario3 = new Usuarios("Wicho", "12345");
        usuarioDAO.insertar(usuario3);

        Usuarios usuario4 = new Usuarios("Alfonso", "12345");
        usuarioDAO.insertar(usuario4);

        Usuarios usuario5 = new Usuarios("Alberto", "12345");
        usuarioDAO.insertar(usuario5);*/

        listar();


    }

    private static void listar(){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuarios> usuarios = usuarioDAO.listar();
        for (Usuarios usuario : usuarios){
            System.out.println("Usuario metodo: " + usuario);
        }
    }

    private static void actualizar(){

    }


}
