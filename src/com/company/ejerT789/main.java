package com.company.ejerT789;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        //0.
        System.out.println("PARTE 0.");
        String cadena = "Setesientos";
        System.out.println(reversa(cadena));

        //1.
        System.out.println("PARTE 1.");
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

        //2.
        System.out.println("PARTE 2.");
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

        //3.
        System.out.println("PARTE 3.");
        Vector<String> vector = new Vector();
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");
        vector.add("Cuatro");
        vector.add("Cinco");
        vector.remove(2);
        vector.remove(3);
        System.out.println("Capacidad: "+vector.capacity());
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }

        //4.
        System.out.println("PARTE 4.");
        Vector<Integer> nVector = new Vector();
        for(int i = 0; i < 10; i++){
            nVector.add(i);
        }
        System.out.println("Capacidad Actual: "+nVector.capacity());
        nVector.add(200);
        System.out.println("Nueva Capacidad: "+nVector.capacity());
        System.out.println("La capacidad del vector por defecto es 10");
        System.out.println("Si pasas esa capacidad, java crea otro vector con el doble de la capacidad");
        System.out.println("y copia el contenido del vector inicial");

        //5.
        System.out.println("PARTE 5.");
        ArrayList<String> aLista = new ArrayList<>();
        aLista.add("Elemento 1");
        aLista.add("Elemento 2");
        aLista.add("Elemento 3");
        aLista.add("Elemento 4");

        LinkedList<String> lLista = new LinkedList<String>();
        for (int i = 0; i < aLista.size(); i++){
            lLista.add(i,aLista.get(i));
        }
        System.out.println("ArrayList");
        for (String pos : aLista){
            System.out.println(pos);
        }
        System.out.println("LinkedList");
        for (String pos : lLista){
            System.out.println(pos);
        }

        //6.
        System.out.println("PARTE 6.");
        LinkedList<Integer> iLLista = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            var nI = 0;
            nI=i+1;
            iLLista.add(nI);
        }
        for (int i = 0; i < iLLista.size(); i++){
            if(iLLista.get(i)%2==0){
                iLLista.remove(i);
            }
        }
        for(Integer pos : iLLista){
            System.out.println(pos);
        }

        //7.
        System.out.println("PARTE 7.");
        try {
            DividePorCero(2,0);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }

    }
    public static void DividePorCero(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
        throw new ArithmeticException("Div 0");
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
