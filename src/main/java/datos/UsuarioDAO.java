package datos;

import domain.Usuarios;

import java.sql.*;
import java.util.*;

import static datos.Conexion.*;

public class UsuarioDAO {

    private static final String SQL_INSERT = "INSERT INTO usuarios (usuario, password) VALUES (?, ?)";
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuarios";
    private static final String SQL_UPDATE = "UPDATE usuarios SET usuario = ?,  password = ? WHERE id_usuario = ?";

    public int insertar(Usuarios usuarios) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuarios.getUsuario());
            stmt.setString(2, usuarios.getPassword());
            registros = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return registros;
    }

    public List<Usuarios> listar() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuarios usuarios = null;

        List<Usuarios> listUsuarios = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()){

                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                usuarios = new Usuarios(idUsuario, usuario, password);
                listUsuarios.add(usuarios);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return listUsuarios;
    }

    public int actualizar(Usuarios usuarios) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuarios.getUsuario());
            stmt.setString(2, usuarios.getPassword());
            stmt.setInt(3, usuarios.getId_usuario());
            registros = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
