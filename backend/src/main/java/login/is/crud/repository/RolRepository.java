package login.is.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import login.is.crud.entity.Rol;

public interface RolRepository extends JpaRepository< Rol, Long> {

    
}
