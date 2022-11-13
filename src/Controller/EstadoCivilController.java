package Controller;

import Dao.EstadoCivilDao;
import Model.EstadoCivil;

import javax.swing.*;
import java.util.List;

public class EstadoCivilController {

    private EstadoCivilDao estadoCivilDao;

    public EstadoCivilController() {
    }

    public EstadoCivilController(EstadoCivilDao estadoCivilDao) {
        this.estadoCivilDao = estadoCivilDao;
    }

    public DefaultComboBoxModel llenarCombo(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        List<EstadoCivil> estadosCiviles = estadoCivilDao.findAll();
        for(EstadoCivil e:estadosCiviles){
            modelo.addElement(e.getNombre());
        }
        return modelo;
    }
}
