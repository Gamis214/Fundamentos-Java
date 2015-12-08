package com.company;

/**
 * Created by Gamis on 12/8/2015.
 */
public class Cliente {

    private String nif,nombre,apellidos;

    public Cliente(String nif,String nombre,String apellidos){
        this.apellidos = apellidos;
        this.nif = nif;
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
