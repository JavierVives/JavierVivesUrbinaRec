package com.example.javi.javiervivesurbinarec;

import java.io.Serializable;

/**
 * Created by Javi on 24/01/2018.
 */

public class Contacto implements Serializable {
    private String nombre, numero;

    //CONSTRUCTOR
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreProducto) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String nombreProducto) {
        this.nombre = numero;
    }
}
