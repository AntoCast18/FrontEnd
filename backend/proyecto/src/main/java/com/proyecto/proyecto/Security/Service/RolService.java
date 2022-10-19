
package com.proyecto.proyecto.Security.Service;

import com.proyecto.proyecto.Security.Entity.Rol;
import com.proyecto.proyecto.Security.Enums.RolNombre;
import com.proyecto.proyecto.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Antonella  */

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
     public void save(Rol rol){
        rolRepository.save(rol);
    }
    
}
