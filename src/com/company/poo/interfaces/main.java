package com.company.poo.interfaces;

import java.util.List;

public class main {
    public static void main(String[] args) {
        EmpleadoCRUD empleado = new EmpleadoCRUD();

        Empleado hillary = new Empleado("Hillary",7,2500,true);
        Empleado edwar = new Empleado("Edwar",42,3500,true);
        Empleado jennifer = new Empleado("Jennifer",40,3000,true);

        empleado.save(hillary);
        empleado.save(edwar);
        empleado.save(jennifer);

        List<Empleado> empleados = empleado.getEmpleados();

        System.out.println(empleados);
    }
}
