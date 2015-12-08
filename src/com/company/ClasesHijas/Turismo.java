package com.company.ClasesHijas;

import com.company.vehiculo;

/**
 * Created by Gamis on 12/8/2015.
 */
public class Turismo extends vehiculo {

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible,int puertas,boolean marchaAutomatica) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public int getPuertas() {
        return puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public String getAtributos(){
        return super.getAtributos() +
                " Puertas: " + this.puertas +
                " Marcha automatica: " + this.marchaAutomatica;
    }
}
