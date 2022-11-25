package com.company.poo;

public class Hdd {
    String marca;
    String size;
    String type;

    public Hdd() {}

    public Hdd(String marca, String size, String tipo) {
        this.marca = marca;
        this.size = size;
        this.type = tipo;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "marca='" + marca + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
