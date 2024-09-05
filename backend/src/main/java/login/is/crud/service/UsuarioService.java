package login.is.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import login.is.crud.entity.Usuario;
import login.is.crud.repository.UsuarioRepository;

@Service
@Transactional

public class UsuarioService {

private UsuarioRepository repositorio;

public UsuarioService (UsuarioRepository repositorio){
    this.repositorio=repositorio;
}

public List<Usuario> getRepositorio(){
    return this.repositorio.findAll();
}




    
}
