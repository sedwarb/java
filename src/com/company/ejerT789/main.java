package com.company.ejerT789;

import java.io.*;
import java.util.*;

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

        //8.
        System.out.println("PARTE 8.");
        try {
            PrintStream fileIn = new PrintStream("fileIn.txt");
            fileIn.println("Esto es una prueba para el ejercicio");
            fileIn.close();

            InputStream in = new FileInputStream("fileIn.txt");

            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream("fileOut.txt");
            out.write(datos);
            out.close();
            System.out.println("Se copio el fileIn en fileOut");
        }catch (Exception e){
            System.out.println("No se creo el Archivo");
        }

        //9.
        System.out.println("PARTE 9.");
        HashMap<String,String> cliente1 = new HashMap<>();
        HashMap<String,String> cliente2 = new HashMap<>();
        LinkedList<HashMap> clientes = new LinkedList<HashMap>();

        cliente1.put("cod","14296150");
        cliente1.put("nombre","edwar");
        cliente1.put("apellido","sebrian");
        cliente2.put("cod","15531903");
        cliente2.put("nombre","jennifer");
        cliente2.put("apellido","alcala");

        clientes.add(cliente1);
        clientes.add(cliente2);

        try{
            PrintStream clientesF = new PrintStream("clientes.txt");
            for(HashMap item : clientes) {
                clientesF.println(item.toString());
            }
            clientesF.close();
        }catch (Exception e) {
            System.out.println("Error en el Archivo");
        }
        System.out.println("Datos del Archivo:");
        try{
            InputStream inH = new FileInputStream("clientes.txt");
            inH.close();
            byte[] datosH = inH.readAllBytes();
            for(byte datoH : datosH) System.out.print((char)datoH);
        }catch (Exception e) {
            System.out.println("Error en el Archivo");
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
