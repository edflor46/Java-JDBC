package domain;

public class Usuarios {

    private int id_usuario;
    private String usuario;
    private String password;

    public Usuarios(int idUsuario, String usuario, String password) {
        this.id_usuario = idUsuario;
        this.usuario = usuario;
        this.password = password;

    }

    public Usuarios(int id_usuario) {
        this.id_usuario = id_usuario;
    }


    public Usuarios(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id_usuario=" + id_usuario +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
