package login.is.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.is.crud.entity.Usuario;
import login.is.crud.service.UsuarioService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UsuarioController {

    UsuarioService se1 ;

    public UsuarioController(UsuarioService se1){
        this.se1=se1;
    }
    @GetMapping("informacion")
    public List<Usuario>informacion() {
        return this.se1.getRepositorio();
    }
    
    


    
    
}
