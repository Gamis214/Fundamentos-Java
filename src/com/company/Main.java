package com.company;

public class Main {

    public static void main(String[] args) {

        // TODO: 12/8/2015 NOTAS DE CODIGO

        /**
         * COMENTARIOS DE DOCUMENTACION
         * @AUTHOR GAMALIEL
         * @VERSION 1.0
         * @SEE Referencias
         */

        //CREACION DE UN OBJETO
        //-->METODO 1
        vehiculo vehiculo = new vehiculo("HEHI8790","CHEVY","98","ROJO",50.60,true);

        //-->METODO 2
        vehiculo2 vehiculo2 = new vehiculo2();
        vehiculo2.setMatricula("HEHI8790");
        vehiculo2.setMarca("CHEVY");
        vehiculo2.setModelo("98");
        vehiculo2.setColor("ROJO");
        vehiculo2.setTarifa(50.60);
        vehiculo2.setDisponible(true);


    }
}
