package login.is.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "identificacion")
    private int identificacion;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "contrasenia")
    private String contrasenia;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "estado")
    private boolean estado;

    public Usuario() {

    }

    public Usuario(int identificacion, String nombre, String correo, String contrasenia, String usuario,
            boolean estado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
        this.estado = estado;
    }

    public int getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contraseña) {
        this.contrasenia = contraseña;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}