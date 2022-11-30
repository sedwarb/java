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

        //crear un array con arraylist
        String[] arreglo = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++){
            arreglo[i] = lista.get(i);
        }
        for (String pos : arreglo){
            System.out.println(pos);
        }
        for (Object pos : lista.toArray()){
            System.out.println(pos);
        }


    }
}
