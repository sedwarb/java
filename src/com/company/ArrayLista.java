package com.company;

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
        //tiene los mismos metodos de los vectores
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        System.out.println(lista);
        lista.remove("Elemento 2");
        System.out.println(lista);
    }
}
