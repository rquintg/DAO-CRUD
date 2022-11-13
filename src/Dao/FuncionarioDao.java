package Dao;


import Dto.FuncionarioDTO;
import Model.Funcionario;
import java.util.List;

public interface FuncionarioDao {

    List<FuncionarioDTO> findAll();

    Funcionario findByDocumento(String documento);

    int save(Funcionario funcionario);

    int update(Funcionario funcionario);

    int delete(String documento);
}
