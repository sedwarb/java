package com.company.progFunc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Edwar");
        nombres.add("Jennifer");
        nombres.add("Hillary");

        nombres.stream().forEach(x-> System.out.println(x));
        System.out.println("- Con Map -");
        Stream<String> valores = nombres.stream().map(x-> x.toUpperCase());
        valores.forEach(System.out::println);

        System.out.println("- Convertir Array en Stream -");
        int[] numeros = {1,2,3,4,5,6};
        var nNumeros = Arrays.stream(numeros).filter(x->x%2==0).reduce((x,y)->x+y);
        System.out.println(Integer.valueOf(nNumeros.getAsInt()));
    }
}
