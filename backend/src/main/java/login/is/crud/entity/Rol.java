package login.is.crud.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Rol {
    @OneToMany
    private List<Permiso> permisos;

    @Id
    private long id;
    @Column(name = "nombreRol")
    private String nombreRol;

    @Column(name = "idPermiso")
    private String idPermiso;

    public String getIdPermiso() {
        return this.idPermiso;
    }

    public void setIdPermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Rol() {
    }

    public Rol(long id, String nombreRol) {
        this.id = id;
        this.nombreRol = nombreRol;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreRol() {
        return this.nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

}
