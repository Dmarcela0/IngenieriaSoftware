package login.is.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import login.is.crud.repository.RolRepository;
import login.is.crud.entity.Rol;


@Service
@Transactional
public class RolService {

private RolRepository repositorio;
public RolService (RolRepository repositorio){
    this.repositorio=repositorio;

}

public List<Rol> getrepositorio(){
    return this.repositorio.findAll();
}

    

    
}
