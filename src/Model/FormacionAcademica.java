package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FormacionAcademica {

    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalDateTime fechacreacion;
    private LocalDateTime fechamodificacion;

    private Universidad idUniversidad;
    private Estado idEstado;
    private Nivel idNivel;
    private Funcionario idFuncionario;

    public FormacionAcademica() {
    }

    public FormacionAcademica(int id, LocalDate fechaInicio, LocalDate fechaFinal, LocalDateTime fechacreacion, LocalDateTime fechamodificacion, Universidad idUniversidad, Estado idEstado, Nivel idNivel, Funcionario idFuncionario) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechacreacion = fechacreacion;
        this.fechamodificacion = fechamodificacion;
        this.idUniversidad = idUniversidad;
        this.idEstado = idEstado;
        this.idNivel = idNivel;
        this.idFuncionario = idFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public LocalDateTime getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDateTime fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public LocalDateTime getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(LocalDateTime fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public Universidad getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Universidad idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }

    public Nivel getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Nivel idNivel) {
        this.idNivel = idNivel;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
