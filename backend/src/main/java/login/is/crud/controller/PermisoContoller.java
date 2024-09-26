package login.is.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.is.crud.entity.Permiso;
import login.is.crud.service.PermisoService;

@RestController
@RequestMapping("/permiso")
public class PermisoContoller {
    @Autowired
    private PermisoService permisoService;

}
