package Dao;

import Dto.FuncionarioDTO;
import Model.Conexion;
import Model.Funcionario;
import Util.Mensajes;

import javax.lang.model.SourceVersion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioImpl implements FuncionarioDao{

    private Conexion conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;

    @Override
    public List<FuncionarioDTO> findAll(){
        List<FuncionarioDTO> funcionarios = new ArrayList<>();

        String sql = "SELECT f.*,t.nombre tnom,e.nombre enom"
                + " FROM funcionarios f"
                + " INNER JOIN tipos_indentificacion t ON f.tipos_indentificacion_id = t.id"
                + " INNER JOIN estado_civil e "
                + "ON f.estado_civil_id = e.id";

//        String sql = "SELECT * FROM funcionarios";
        try {
            conexion = new Conexion();
            st = conexion.getCon().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                FuncionarioDTO funcionario = new FuncionarioDTO();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNumeroIdentificacion(rs.getString("numero_identificacion"));
                funcionario.setNombre(rs.getString("nombres"));
                funcionario.setApellido(rs.getString("apellidos"));
                funcionario.setDireccion(rs.getString("direccion"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setTelefono(rs.getString("telefono"));
                funcionario.setFechaNacimiento(LocalDate.parse(rs.getString("fecha_nacimiento")));
                funcionario.setDtoIdTipodeIdentificacion(rs.getString("tnom"));
                funcionario.setDtoIdEstadoCivil(rs.getString("enom"));
                funcionarios.add(funcionario);

            }
            st.close();
            rs.close();
            conexion.getCon().close();
        } catch (Exception e){
            Mensajes.mensajeError("Error al consultar los funcionarios: ", e.getMessage());
        }

        return funcionarios;

}

    @Override
    public Funcionario findByDocumento(String documento){
        Funcionario funcionario = new Funcionario();
        String sql = "SELECT * FROM funcionarios WHERE " + " numero_identificacion =?";
        try {
            conexion = new Conexion();
            pst = conexion.getCon().prepareStatement(sql);
            pst.setString(1, documento);
            rs = pst.executeQuery();
            while (rs.first()){
                funcionario.setId(rs.getInt("id"));
                funcionario.setNumeroIdentificacion(rs.getString("numero_identificacion"));
                funcionario.setNombre(rs.getString("nombre"));
                funcionario.setApellido(rs.getString("apellido"));
                funcionario.setDireccion(rs.getString("direccion"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setTelefono(rs.getString("telefono"));
                funcionario.setFechaNacimiento(LocalDate.parse(rs.getString("fecha_nacimiento")));
            }
            st.close();
            rs.close();
            conexion.getCon().close();
        } catch (Exception e){
            Mensajes.mensajeError("Error al consultar el funcionario: ", e.getMessage());
        }

        return funcionario;
    }

    @Override
    public int save(Funcionario funcionario) {
        int resultado = 0;
        String sql = "INSERT INTO funcionarios(" +
                "numero_identificacion," +
                "nombres," +
                "apellidos," +
                "sexo," +
                "direccion," +
                "telefono," +
                "fecha_nacimiento," +
                "tipos_indentificacion_id," +
                "fecha_creacion," +
                "fecha_actualizacion," +
                "estado_civil_id" +
                ")" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, NOW(), NOW(), ?)";
        conexion = new Conexion();
        try {
            pst = conexion.getCon().prepareStatement(sql);
            pst.setString(1, funcionario.getNumeroIdentificacion());
            pst.setString(2, funcionario.getNombre());
            pst.setString(3, funcionario.getApellido());
            pst.setString(4, String.valueOf(funcionario.getSexo()));
            pst.setString(5, funcionario.getDireccion());
            pst.setString(6, funcionario.getTelefono());
            pst.setString(7, funcionario.getFechaNacimiento().toString());
            pst.setInt(8, funcionario.getIdTipodeIdentificacion().getId());
            pst.setInt(9, funcionario.getIdEstadoCivil().getId());
            resultado = pst.executeUpdate();
            pst.close();
            conexion.getCon().close();
        } catch (SQLException ex) {
            Mensajes.mensajeError("Error al guardar el funcionario: ", ex.getMessage());
        }
        return resultado;
    }

    @Override
    public int update(Funcionario funcionario) {
        // TODO: Implementar parecido al save
        // String sql = "UPDATE funcionarios SET nombres=?,apellidos=?..."
        int resultado = 0;
        String sql = "UPDATE funcionarios SET " +
                "numero_identificacion = ?," +
                "nombres = ?," +
                "apellidos = ?," +
                "sexo = ?," +
                "direccion = ?," +
                "telefono = ?," +
                "fecha_nacimiento = ?," +
                "tipos_indentificacion_id = ?," +
                "fecha_actualizacion = NOW()," +
                "estado_civil_id = ? WHERE numero_identificacion =?";
        conexion = new Conexion();
        try {
            pst = conexion.getCon().prepareStatement(sql);
            pst.setString(1, funcionario.getNumeroIdentificacion());
            pst.setString(2, funcionario.getNombre());
            pst.setString(3, funcionario.getApellido());
            pst.setString(4, String.valueOf(funcionario.getSexo()));
            pst.setString(5, funcionario.getDireccion());
            pst.setString(6, funcionario.getTelefono());
            pst.setString(7, funcionario.getFechaNacimiento().toString());
            pst.setInt(8, funcionario.getIdTipodeIdentificacion().getId());
            pst.setInt(9, funcionario.getIdEstadoCivil().getId());
            pst.setString(10, funcionario.getNumeroIdentificacion());
            resultado = pst.executeUpdate();
            pst.close();
            conexion.getCon().close();
        } catch (SQLException ex) {
            Mensajes.mensajeError("Error al actualizar el funcionario: ", ex.getMessage());
        }
        return resultado;
    }

    @Override
    public int delete(String documento) {
        String sql = "DELETE FROM funcionarios WHERE "
                + "numero_identificacion=?";
        conexion = new Conexion();
        try {
            pst = conexion.getCon().prepareStatement(sql);
            pst.setString(1, documento);
            pst.executeUpdate();
            conexion.getCon().close();
        } catch (SQLException ex) {
            Mensajes.mensajeError("Error al eliminar el funcionario", ex.getMessage());
        }
        return 0;
    }




}
