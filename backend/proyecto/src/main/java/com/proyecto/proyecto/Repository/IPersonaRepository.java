/*
*/
package com.proyecto.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.proyecto.Entity.Persona;

/**
 *
 * @author Antonella
 */

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
