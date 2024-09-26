package login.is.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Permiso {
    @ManyToOne
    private Rol rol;

    @Id
    private long id;
    @Column(name = "nombrePermiso")
    private String nombrePermiso;

    public Permiso(long id, String nombrePermiso) {
        this.id = id;
        this.nombrePermiso = nombrePermiso;
    }

    public Permiso() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombrePermiso() {
        return this.nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
