
package com.proyecto.proyecto.Security.Repository;

import com.proyecto.proyecto.Security.Entity.Rol;
import com.proyecto.proyecto.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** * @author Antonella  */
@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
