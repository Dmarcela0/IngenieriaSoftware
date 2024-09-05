package login.is.crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import login.is.crud.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByIdentificacion(int identificacion);
    boolean existsByIdentificacion(int identificacion);
    void deleteByIdentificacion(Number identificacion);    
}
