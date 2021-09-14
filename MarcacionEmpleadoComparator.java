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
public class MarcacionEmpleadoComparator implements Comparator<Marcacion>{
    @Override
    public int compare(Marcacion o1, Marcacion o2) {
        return o1.getEmpleado().compareTo(o2.getEmpleado());
    }
    
    
}
