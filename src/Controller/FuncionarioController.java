package Controller;

import Dao.FuncionarioDao;
import Dto.FuncionarioDTO;
import Model.Funcionario;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class FuncionarioController {

    private final FuncionarioDao funcionarioDao;

    public FuncionarioController(FuncionarioDao funcionarioDao) {
        this.funcionarioDao = funcionarioDao;
    }

    public DefaultTableModel llenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable( int row, int column){
            return false;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("SEXO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("FECHA NACIMIENTO");
        modelo.addColumn("TIPO IDENTIFICACION");
        modelo.addColumn("ESTADO CIVIL");
        List<FuncionarioDTO> funcionarios = funcionarioDao.findAll();
        String [] datos = new String[12];
        for (FuncionarioDTO funcionario : funcionarios){
            datos[0] = String.valueOf(funcionario.getId());
            datos[1] = funcionario.getNumeroIdentificacion();
            datos[2] = funcionario.getNombre();
            datos[3] = funcionario.getApellido();
            datos[4] = funcionario.getSexo();
            datos[5] = funcionario.getDireccion();
            datos[6] = funcionario.getTelefono();
            datos[7] = funcionario.getFechaNacimiento().toString();
            datos[8] = String.valueOf(funcionario.getDtoIdEstadoCivil());
            datos[9] = String.valueOf(funcionario.getDtoIdTipodeIdentificacion());
            modelo.addRow(datos);
        }

        return modelo;
    }

    public Funcionario listarPorDocumento(String documento){
        return funcionarioDao.findByDocumento(documento);
    }

    public int guardar(Funcionario funcionario){
        return funcionarioDao.save(funcionario);
    }

    public int actualizar(Funcionario funcionario){
        return funcionarioDao.update(funcionario);
    }

    public int eliminar(String funcionario){
        return funcionarioDao.delete(funcionario);
    }
}
