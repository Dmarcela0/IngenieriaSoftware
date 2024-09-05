package login.is.crud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import login.is.crud.entity.Usuario;
import login.is.crud.repository.UsuarioRepository;

@Service
@Transactional

public class UsuarioService {

UsuarioRepository usuarioRepository;

public Optional<Usuario> obtenerPorIdentificacion (int identificacion){
    return usuarioRepository.findByIdentificacion(identificacion);

}

public boolean existsByIdentificacion(int identificacion) {
    return usuarioRepository.existsByIdentificacion(identificacion);
  }

  public void deleteByIdentificacion(int identificacion) {
    usuarioRepository.deleteByIdentificacion(identificacion);
  }

  public void guardar(Usuario usuario) {
    usuarioRepository.save(usuario);
  }



    
}
