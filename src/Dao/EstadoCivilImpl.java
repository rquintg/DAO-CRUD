package Dao;

import Model.Conexion;
import Model.EstadoCivil;
import Util.Mensajes;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstadoCivilImpl implements EstadoCivilDao{

    private Conexion conexion;
    private Statement st;
    private ResultSet rs;

    @Override
    public List<EstadoCivil> findAll() {
        List<EstadoCivil> estadoCiviles = new ArrayList<>();
        String sql = "SELECT * FROM estado_civil";
        try {
            conexion = new Conexion();
            st = conexion.getCon().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                EstadoCivil estadoCivil = new EstadoCivil();
                estadoCivil.setId(rs.getInt("id"));
                estadoCivil.setNombre(rs.getString("nombre"));
                estadoCivil.setDescripcion(rs.getString("descripcion"));
                estadoCiviles.add(estadoCivil);
            }
            st.close();
            rs.close();
            conexion.getCon().close();
        } catch (Exception e) {
            Mensajes.mensajeError("Error al consultar los estados civiles: ", e.getMessage());
        }

        return estadoCiviles;

    }

}
