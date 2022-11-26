package com.company.poo.interfaces.implementado;

import com.company.poo.interfaces.Empleado;

public class main {
    static EmpleadoCRUD empleadoCRUD = new EmpleadoMySql();
    public static void main(String[] args) {
        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
