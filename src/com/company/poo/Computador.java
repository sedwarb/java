package com.company.poo;

public class Computador {
    String marca;
    String modelo;
    Hdd discoDuro;

    public Computador() {}

    public Computador(String marca, String modelo, Hdd discoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", discoDuro=" + discoDuro +
                '}';
    }
}
