package com.company;

public class Funciones {
    public static void main(String[] args) {
        System.out.println("El Precio es: "+precio(100000));
    }
    static double precio(double precio){
        return precio + (precio*0.2);
    }
}
