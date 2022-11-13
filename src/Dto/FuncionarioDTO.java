package Dto;


import java.io.Serializable;
import java.time.LocalDate;


public class FuncionarioDTO implements Serializable {


    private int id;
    private String numeroIdentificacion;
    private String nombre;
    private String apellido;
    private String sexo;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;

    private String DtoIdTipodeIdentificacion;
    private String DtoIdEstadoCivil;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDtoIdTipodeIdentificacion() {
        return DtoIdTipodeIdentificacion;
    }

    public void setDtoIdTipodeIdentificacion(String dtoIdTipodeIdentificacion) {
        DtoIdTipodeIdentificacion = dtoIdTipodeIdentificacion;
    }

    public String getDtoIdEstadoCivil() {
        return DtoIdEstadoCivil;
    }

    public void setDtoIdEstadoCivil(String dtoIdEstadoCivil) {
        DtoIdEstadoCivil = dtoIdEstadoCivil;
    }
}
