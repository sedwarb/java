package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        //array asociativo
        //es como un diccionario, con clave valor
        //El mapa mas primitivo: -->
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Clave1",1);
        map.put("Clave2",2);
        map.put("Clave3",3);
        System.out.println(map);
        System.out.println(map.get("Clave2"));
        map.replace("Clave3",240);
        System.out.println(map);

        for(Map.Entry<String, Integer> elemento : map.entrySet()){
            System.out.println(elemento);
            System.out.println("Valor: " + elemento.getValue() + " Clave1: " + elemento.getKey());
        }
    }
}
