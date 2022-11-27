package com.company.ejercicioInt;

public class main {
    public static void main(String[] args) {
        CocheCRUDImpl coche = new CocheCRUDImpl("Se Salvo la Info","Se Encontro la Info","Se borro la Info");
        System.out.println(coche.save());
        System.out.println(coche.findAll());
        System.out.println(coche.delete());
    }
}
