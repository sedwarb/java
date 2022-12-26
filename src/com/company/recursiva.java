package com.company;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class recursiva {
    public static void main(String[] args) {
        System.out.println(suma(5));
        System.out.println("Valor del 0 hasta 5: "+Integer.valueOf(total(5).getAsInt()));
    }
    public static OptionalInt total(int valor) {
        return IntStream.rangeClosed(1,valor).reduce((x,y)->x+y);
    }
    public static int suma(int max){
        if(max>0) return max+suma(max-1);
        else return 0;
    }
}
