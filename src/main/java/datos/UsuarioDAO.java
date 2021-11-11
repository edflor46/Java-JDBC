package datos;

import domain.Usuarios;

import java.sql.*;

import static datos.Conexion.*;

public class UsuarioDAO {

    private static final String SQL_INSERT = "INSERT INTO usuarios (usuario, password) VALUES (?, ?)";

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
}
