package login.is.crud.controller;

import login.is.crud.entity.Permiso;
import login.is.crud.service.PermisoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PermisoContoller {
    PermisoService permisoService;
    public PermisoContoller(PermisoService permisoService) { this.permisoService = permisoService; }

    @GetMapping("")
    public List<Permiso> getAllPermisos() { return this.permisoService.getRepositorio(); }

}
