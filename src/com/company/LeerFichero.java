package com.company;

import java.io.FileInputStream;
import java.io.InputStream;

public class LeerFichero {
    public static void main(String[] args) {
        forma2();
    }
    //Lee linea por linea
    public static void forma2(){
        try {
            InputStream fichero = new FileInputStream("C:/javaText.txt");
            int dato = fichero.read();
            while (dato != -1) {
                System.out.print((char)dato);
                dato = fichero.read();
            }
        }catch (Exception e) {
            System.out.println("Error");
        }

    }
    //lee todo a la vez
    public static void forma1(){
        try{
            InputStream fichero = new FileInputStream("C:/javaText.txt");
            byte[] data = fichero.readAllBytes();
            for(byte dato : data) System.out.print((char)dato);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}