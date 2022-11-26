package com.company.poo.interfaces;

public class Empleado {
    String nombre;
    int edad;
    double salario;
    boolean activo;

    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", activo=" + activo +
                '}';
    }
}
