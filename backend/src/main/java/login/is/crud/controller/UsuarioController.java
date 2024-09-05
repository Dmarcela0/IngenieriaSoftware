package login.is.crud.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import login.is.crud.entity.Usuario;
import login.is.crud.service.UsuarioService;



@RestController
public class UsuarioController {

    UsuarioService se1 ;

    public UsuarioController(UsuarioService se1){
        this.se1=se1;
    }
    @GetMapping("usuarios")
    public List<Usuario>usuario() {
        return this.se1.getRepositorio();
    }
    
    


    
    
}
