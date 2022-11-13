package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GrupoFamiliar {

    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDateTime fechacreacion;
    private LocalDateTime fechamodificacion;

    private Rol idrol;
    private Funcionario idfuncionario;

    public GrupoFamiliar() {
    }

    public GrupoFamiliar(int id, String nombre, String apellido, String direccion, LocalDateTime fechacreacion, LocalDateTime fechamodificacion, Rol idrol, Funcionario idfuncionario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechacreacion = fechacreacion;
        this.fechamodificacion = fechamodificacion;
        this.idrol = idrol;
        this.idfuncionario = idfuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Rol getIdrol() {
        return idrol;
    }

    public void setIdrol(Rol idrol) {
        this.idrol = idrol;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }
}
