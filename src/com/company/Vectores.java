package com.company;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Ingreso 1");
        vector.add("Ingreso Dos");
        vector.add("Ingreso 3");
        System.out.println(vector);
        vector.remove("Ingreso 1");
        System.out.println(vector);
        vector.add("Ultimo Ingreso");
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        vector.add("Ingreso Dos");
        System.out.println(vector);


        for(String posicion : vector){
            System.out.println(posicion);
        }
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }
    }
}
