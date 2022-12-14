package com.company.ejerT789;

import java.util.Vector;

public class main {
    public static void main(String[] args) {
        //1.
        System.out.println("PARTE 1.");
        String cadena = "Setesientos";
        System.out.println(reversa(cadena));

        //2.
        System.out.println("PARTE 2.");
        String[][] bidimension = new String[2][2];
        bidimension[0][0] = "Simon";
        bidimension[0][1] = "Bolivar";
        bidimension[1][0] = "Francisco";
        bidimension[1][1] = "De Miranda";
        for (int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++){
                System.out.println(bidimension[i][j]);
            }
        }

        //3.
        System.out.println("PARTE 3.");
        int[][] bidimensionInt = new int[2][2];
        bidimensionInt[0][0] = 7;
        bidimensionInt[0][1] = 40;
        bidimensionInt[1][0] = 42;
        bidimensionInt[1][1] = 50;
        for (int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++){
                System.out.println("Posicion: "+"["+i+"]"+"["+j+"]"+": "+bidimensionInt[i][j]);
            }
        }

        //4.
        System.out.println("PARTE 4.");
        Vector<String> vector = new Vector();
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");
        vector.add("Cuatro");
        vector.add("Cinco");
        vector.remove(2);
        vector.remove(3);
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }
    }

    public static String reversa(String cadena){
        String nstr="";
        char ch;
        for (int i=0; i<cadena.length(); i++)
        {
            ch= cadena.charAt(i);
            nstr= ch+nstr;
        }
        return nstr;
    }
}
