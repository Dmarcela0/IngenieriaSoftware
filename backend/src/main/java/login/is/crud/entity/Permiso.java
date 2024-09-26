package login.is.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Permiso {
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    @Id
    private int id;
    @Column(name = "nombrePermiso")
    private String nombrePermiso;

    public Permiso(Rol rol, int id, String nombrePermiso) {
        this.rol = rol;
        this.id = id;
        this.nombrePermiso = nombrePermiso;
    }

    public Permiso() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(int id) {
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
