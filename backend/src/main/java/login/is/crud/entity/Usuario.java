package login.is.crud.entity;

public class Usuario {
    private int identificacion;
    private String nombre;
    private String correo;
    private String contraseña;
    private String usuario;
    private boolean estado; 


    public Usuario(int identificacion, String nombre, String correo, String contraseña, String usuario, boolean estado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
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

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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