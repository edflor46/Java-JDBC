package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        //Cadena de conexion
        //String url = "jdbc:mysql://localhost:3307/test_java?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        //Conexion
        /*
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "lalo2393");

            Statement instruccion = conexion.createStatement();

            //Select a base de datos
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

            //Ejecutar instruccion
            ResultSet resultado = instruccion.executeQuery(sql);

            //Recorrer datos
            while(resultado.next()){
                System.out.print("ID persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }

            //Cerrar objetos
            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }

         */


    }
}
