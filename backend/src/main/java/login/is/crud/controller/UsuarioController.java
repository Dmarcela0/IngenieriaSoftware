package login.is.crud.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import login.is.crud.entity.Usuario;
import login.is.crud.service.UsuarioService;



@RestController
public class UsuarioController {

    UsuarioService pacienteService ;


    @GetMapping("/")
	public ResponseEntity<List<Usuario>> getLista() {
		List<Usuario> lista = pacienteService.obtenerTodos();
		return new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);
	}
    
    
    


    
    
}
