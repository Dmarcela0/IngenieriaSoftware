package login.is.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.is.crud.entity.Rol;
import login.is.crud.service.RolService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    private ResponseEntity<List<Rol>> getAllRol() {
        return ResponseEntity.ok(rolService.findAll());

    }

}
