package Dao;


import Model.Conexion;
import Model.TipodeIdentificacion;
import Util.Mensajes;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoIdentificacionImpl implements TipoIdentificacionDao{

    private Conexion conexion;
    private Statement st;
    private ResultSet rs;

    @Override
    public List<TipodeIdentificacion> findAll() {
        List<TipodeIdentificacion> tipoIDS = new ArrayList<>();
        String sql = "SELECT * FROM tipos_indentificacion";
        try {
            conexion = new Conexion();
            st = conexion.getCon().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                TipodeIdentificacion tipoID = new TipodeIdentificacion();
                tipoID.setId(rs.getInt("id"));
                tipoID.setNombre(rs.getString("nombre"));
                tipoID.setDescripcion(rs.getString("descripcion"));
                tipoIDS.add(tipoID);
            }
            st.close();
            rs.close();
            conexion.getCon().close();
        } catch (Exception e) {
            Mensajes.mensajeError("Error al consultar los tipos de identificacion: ", e.getMessage());
        }


        return tipoIDS;
    }
}
