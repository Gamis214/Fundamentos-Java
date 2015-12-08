package com.company;

/**
 * Created by Gamis on 12/8/2015.
 */
public class VehiculoAlquilado {

    private Cliente cliente;
    private vehiculo vehiculo;
    private int diaAlquiler,mesAlquiler,añoAlquiler,totalAlquiler;

    public VehiculoAlquilado(Cliente cliente, vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalAlquiler = totalAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public com.company.vehiculo getVehiculo() {
        return vehiculo;
    }



}
