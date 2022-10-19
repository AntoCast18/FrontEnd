
package com.proyecto.proyecto.Security.Service;

import com.proyecto.proyecto.Security.Entity.Usuario;
import com.proyecto.proyecto.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/** @author Antonella */

@Service
public class UserDatailsImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;
    private String nombreUsuario;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
       return UsuarioPrincipal.build(usuario);
    }
}
