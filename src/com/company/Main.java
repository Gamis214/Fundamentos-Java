package com.company;

import com.company.ClasesHijas.Deportivos;
import com.company.ClasesHijas.Furgoneta;
import com.company.ClasesHijas.Turismo;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Main {

    public static void main(String[] args) {

        // TODO: 12/8/2015 NOTAS DE CODIGO

        /**
         * COMENTARIOS DE DOCUMENTACION
         * @AUTHOR GAMALIEL
         * @VERSION 1.0
         * @SEE Referencias
         */

        //CREACION DE UN OBJETO ------------------------------------------------------------------

        //-->METODO 1
        vehiculo vehiculo1 = new vehiculo("HEHI8790","CHEVY","98","ROJO",50.60,true);

        //-->METODO 2
        vehiculo2 vehiculo2 = new vehiculo2();
        vehiculo2.setMatricula("HEHI8790");
        vehiculo2.setMarca("CHEVY");
        vehiculo2.setModelo("98");
        vehiculo2.setColor("ROJO");
        vehiculo2.setTarifa(50.60);
        vehiculo2.setDisponible(true);

        System.out.println(vehiculo1.getColor());
        System.out.println(vehiculo1.getMatricula());

        vehiculo1.cambiarMatricula(vehiculo1,"GAGAGAGAGA");
        System.out.println(vehiculo1.getMatricula());

        //Se puede tener dos metodos llamados iguales pero que reciben diferentes parametros.
        vehiculo1.cambiarMatricula(vehiculo1,"1398","HEHI");
        System.out.println(vehiculo1.getMatricula());
        //-----------------------------------------------------------------------------------------

        //******************* EJERCICIO 1 ************************************
        //TODO Ejercicio No.1

        //Creamos dos obj.vehiculos
        vehiculo auto1 = new vehiculo("HEHI","FERRA","2015","AZUL",0.00,false);
        vehiculo auto2 = new vehiculo("GEGI","CHEVY","2018","AMARILLO",0.00,false);

        //Generamos el Cliente
        Cliente cliente = new Cliente("3020X","ivan","Hernandez");

        //Creamos una instancia de la clase VehiculoAlquilado que
        //realciona al cliente con el vehiculo1 y se alquila
        //con fecha 11/11/2015 durante 2 dias
        VehiculoAlquilado vehiculoAlquilado = new VehiculoAlquilado(cliente,auto1,11,11,2015,2);

        //Mostramos los datos del vehiculo alquilado:
        System.out.println("VEHICULO ALQUILADO");
        System.out.println("Cliente: " +
                vehiculoAlquilado.getCliente().getNif() +" " +
                vehiculoAlquilado.getCliente().getNombre()+" " +
                vehiculoAlquilado.getCliente().getApellidos()+" ");
        System.out.println("Auto: " +
                vehiculoAlquilado.getVehiculo().getMatricula()+" " +
                vehiculoAlquilado.getVehiculo().getModelo()+" " +
                vehiculoAlquilado.getVehiculo().getColor() +" ");
        //********************************************************************

        //******************* EJERCICIO 2 ************************************
        //TODO Ejercicio No.2

        //Generamos las clases Deportivos,Furgoneta y Turismo y creamos los vehiculos
        System.out.println("**********************************************");

        vehiculo miVehiculo = new vehiculo("FEFE","BMW","2008","VERDE",0.00,true);

        //Metodo No.1 ***********************
        Turismo miTurismo = new Turismo("GEGI","DODGE","2011","GRIS",0.00,true,4,true);
        //Metodo No.2
        vehiculo miTurismo2 = new Turismo("GEGI","DODGE","2011","GRIS",0.00,true,4,true);
        //Metodo No.3
        vehiculo miTurismo3 = miTurismo;
        //Metodo No.4
        Turismo miNuevoTurismo = (Turismo) miTurismo2;
        //***********************************

        Furgoneta miFurgoneta = new Furgoneta("KEKE","GT","2000","AZUL",0.00,true,50,15);
        Deportivos miDeportivo = new Deportivos("DEDE","FERRARI","2020","ROJO",0.00,true,80);

        //Mandamos a llamar el getAtributos de cada Objeto
        System.out.println(miVehiculo.getAtributos());
        System.out.println(miTurismo.getAtributos());
        System.out.println(miTurismo2.getAtributos());
        System.out.println(miTurismo3.getAtributos());
        System.out.println(miNuevoTurismo.getAtributos());
        System.out.println(miFurgoneta.getAtributos());
        System.out.println(miDeportivo.getAtributos());

        System.out.println("**********************************************");

        //********************************************************************

    }
}
