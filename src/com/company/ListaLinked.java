package com.company;

import java.util.LinkedList;

public class ListaLinked {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Es Mas Rapida");
        lista.add("para Modificar");
        lista.add("que el ArrayList");
        lista.add("pero el ArrayList");
        lista.add("es mas rapido en la busqueda");
        for(String item : lista) {
            System.out.println(item);
        }
    }
}
