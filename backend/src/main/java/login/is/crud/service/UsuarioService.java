package login.is.crud.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import login.is.crud.entity.Usuario;

@Service
@Transactional


public class UsuarioService {
Usuario usuario1;
public UsuarioService(){
    this.usuario1 = new Usuario(1030520666, "Diana Garzon", "dianagarzon0513@gmail.com", "123","Dmarcela0", true);
    

}

public Usuario getUsuario(){
    return this.usuario1;
}




    
}
