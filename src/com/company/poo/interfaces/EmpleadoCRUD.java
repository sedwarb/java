package com.company.poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {
    private List<Empleado> empleados = new ArrayList<>();
    public void save(Empleado empleado) {empleados.add(empleado);}

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
