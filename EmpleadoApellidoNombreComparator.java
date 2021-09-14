/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.floripa;

import java.util.Comparator;

/**
 *
 * @author Alexis
 */
public class EmpleadoApellidoNombreComparator implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        int resultado = o1.getApellido().compareTo(o2.getApellido());
        if (resultado == 0) {
            resultado = o1.getNombre().compareTo(o2.getNombre());
        }
        return resultado;
    }

}
