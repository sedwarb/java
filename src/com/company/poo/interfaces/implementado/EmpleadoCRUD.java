package com.company.poo.interfaces.implementado;

import com.company.poo.interfaces.Empleado;

import java.util.List;

/**
 * Se declaran los metodos pero no se implementan
 * Aqui se muestra lo que hay que hacer, pero no se hace
 */

public interface EmpleadoCRUD {
    void save(Empleado empleado);
    List<Empleado> findAll();
    void delete(Empleado empleado);
}
