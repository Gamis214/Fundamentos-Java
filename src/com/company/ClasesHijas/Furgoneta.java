package com.company.ClasesHijas;

import com.company.vehiculo;

/**
 * Created by Gamis on 12/8/2015.
 */
public class Furgoneta extends vehiculo {

    private int carga,volumen;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int carga, int volumen) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public String getAtributos(){
        return super.getAtributos() +
                " Furgoneta (Kg): " + this.carga +
                " Volumen (m3): " + this.volumen;
    }
}
