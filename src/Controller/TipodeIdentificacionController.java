package Controller;

import Dao.TipoIdentificacionDao;
import Model.TipodeIdentificacion;

import javax.swing.*;
import java.util.List;

public class TipodeIdentificacionController {

    private TipoIdentificacionDao tipoIdentificacionDao;

    public TipodeIdentificacionController() {
    }

    public TipodeIdentificacionController(TipoIdentificacionDao tipoIdentificacionDao) {
        this.tipoIdentificacionDao = tipoIdentificacionDao;
    }

    public DefaultComboBoxModel llenarCombo(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        List<TipodeIdentificacion> tiposIds = tipoIdentificacionDao.findAll();
        for(TipodeIdentificacion t:tiposIds){
            modelo.addElement(t.getDescripcion());
        }
        return modelo;
    }
}
