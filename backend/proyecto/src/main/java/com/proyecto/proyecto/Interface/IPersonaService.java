/*
*/
package com.proyecto.proyecto.Interface;

import com.proyecto.proyecto.Entity.Persona;
import java.util.List;

/**
 *
 * @author Antonella
 */
public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    // guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    //eliminar un objeto de tipo persona por id
    public void deletePersona(Long id);
    //buscar persona por id
    public Persona findPersona(Long id);
    
    }
