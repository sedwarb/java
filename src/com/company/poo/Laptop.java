package com.company.poo;

public class Laptop extends Computador{
    String pulgadas;

    public Laptop(String marca, String modelo, Hdd discoDuro, String pulgadas) {
        super(marca, modelo, discoDuro);
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "pulgadas='" + pulgadas + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", discoDuro=" + discoDuro +
                '}';
    }
}
