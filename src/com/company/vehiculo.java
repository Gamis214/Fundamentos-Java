package com.company;

public class vehiculo {

    private String matricula,marca,modelo,color;
    private double tarifa;
    private boolean disponible;

    public vehiculo(String matricula,String marca, String modelo, String color,double tarifa, boolean disponible){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public void cambiarMatricula(vehiculo v,String Matricula){
        v.setMatricula(Matricula);
    }

    public void cambiarMatricula(vehiculo v,String Matricula,String Iniciales){
        StringBuilder st = new StringBuilder();
        st.append(Matricula + " - ");
        st.append(Iniciales);
        v.setMatricula(st.toString());
    }

    public String getAtributos(){
        return "Matricula: " + this.matricula +
                " Modelo: " + this.modelo +
                " Color: " + this.color +
                " tarifa: " + this.tarifa +
                " disponible: " + this.disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
