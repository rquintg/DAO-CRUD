package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Util.Mensajes;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/CrudDAO";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private Connection con;

    public Conexion() {
        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            con.createStatement();
        } catch (SQLException ex) {
            Mensajes.mensajeError("Error de conexión", ex.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
