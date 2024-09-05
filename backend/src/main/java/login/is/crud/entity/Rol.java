package login.is.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (name = "nombreRol")
        private String nombreRol;

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
