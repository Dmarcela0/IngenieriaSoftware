package login.is.crud.service;

import jakarta.transaction.Transactional;
import login.is.crud.entity.Permiso;
import login.is.crud.repository.PermisoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PermisoService {
    private PermisoRepository permisoRepository;
    public PermisoService(PermisoRepository permisoRepository) { this.permisoRepository = permisoRepository;}
    public List<Permiso> getRepositorio() { return this.permisoRepository.findAll(); }
}
