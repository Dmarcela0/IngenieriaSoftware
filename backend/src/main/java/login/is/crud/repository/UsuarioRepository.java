package login.is.crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import login.is.crud.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByIdentificacion(int identificacion);
    boolean existsByIdentificacion(int identificacion);
    boolean existsByEmail(String correo);
    void deleteByIdentificacion(Number identificacion);
    @Query("FROM Usuario p WHERE p.estado='Activo'")
    public List<Usuario> obtenerTodos();
    
}
