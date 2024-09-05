package login.is.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import login.is.crud.entity.Rol;
import login.is.crud.service.RolService;

@RestController

public class RolController {

    RolService r1;

    public RolController(RolService r1){
        this.r1=r1;
    }
    
@GetMapping("rol")
public List<Rol>rol() {
        return this.r1.getrepositorio();
    }
    
}
