package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario {

    private int id;
    private String numeroIdentificacion;
    private String nombre;
    private String apellido;
    private String sexo;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;

    private TipodeIdentificacion idTipodeIdentificacion;
    private EstadoCivil idEstadoCivil;

    public Funcionario() {
    }

    public Funcionario(int id, String numeroIdentificacion, String nombre, String apellido, String sexo, String direccion, String telefono, LocalDate fechaNacimiento, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, TipodeIdentificacion idTipodeIdentificacion, EstadoCivil idEstadoCivil) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.idTipodeIdentificacion = idTipodeIdentificacion;
        this.idEstadoCivil = idEstadoCivil;
    }

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

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public TipodeIdentificacion getIdTipodeIdentificacion() {
        return idTipodeIdentificacion;
    }

    public void setIdTipodeIdentificacion(TipodeIdentificacion idTipodeIdentificacion) {
        this.idTipodeIdentificacion = idTipodeIdentificacion;
    }

    public EstadoCivil getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(EstadoCivil idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }
}
