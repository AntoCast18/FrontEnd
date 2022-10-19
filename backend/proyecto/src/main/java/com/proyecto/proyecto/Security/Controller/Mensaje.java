package com.proyecto.proyecto.Security.Controller;

/**
 * controla los mensajes
 *
 * @author Antonella
 */
public class Mensaje {

    private String mensaje;

    //contructor
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //getters and setter
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
