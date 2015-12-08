package com.company.ClasesHijas;

import com.company.vehiculo;

/**
 * Created by Gamis on 12/8/2015.
 */
public class Deportivos extends vehiculo {

    private int cilindrada;

    public Deportivos(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int cilindrada) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getAtributos(){
        return super.getAtributos() +
                " Cilindrada (cm3): " + this.cilindrada;
    }

}
