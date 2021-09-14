/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.floripa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Alexis
 */
public class MarcacionesAdmin extends MarcacionesAdminAbstract {

    public MarcacionesAdmin() {
        super();
    }

    /**
     * Devuelve todos los empleados de los que se tiene registro de marcación
     * (No repetir resultados).
     *
     * @return
     */
    public List<Empleado> retornaTodos() {
        List<Empleado> todos = new ArrayList();
        marcacionesList.forEach(marc -> {
            todos.add(marc.getEmpleado());
//        for (Marcacion marc:marcacionesList) {
//            todos.add(marc.getEmpleado());
        });
        return todos;
    }

    @Override
    public List<Empleado> empleados() {
        List<Empleado> listaSinDup;
        listaSinDup = (List<Empleado>) retornaTodos()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        return listaSinDup;
    }

    @Override
    public List<Marcacion> filtroPorEmpleado(Empleado empleado) {
        List<Marcacion> porEmpl = new ArrayList();
        marcacionesList.stream().filter(marc -> (marc.getEmpleado() == empleado)).forEachOrdered(marc -> {
            porEmpl.add(marc);
        });//        for (Marcacion marc:marcacionesList) {
//            if (marc.getEmpleado() == empleado) {
//                porEmpl.add(marc);
//            }
//
        return porEmpl;
    }

    @Override
    public List<Marcacion> filtroPorTipo(MarcacionTipo tipo) {
        List<Marcacion> porTipo = new ArrayList();
        marcacionesList.stream().filter(marc -> (marc.getTipo() == tipo)).forEachOrdered(marc -> {
            porTipo.add(marc);
        });//        for (Marcacion marc:marcacionesList) {
//            if (marc.getTipo() == tipo) {
//                porTipo.add(marc);
//            }
        return porTipo;
    }

    @Override
    public List<Marcacion> llegaronTarde() {
        List<Marcacion> irrespons = new ArrayList();

        marcacionesList.stream().filter(marc -> (marc.getTipo() == MarcacionTipo.ENTRADA)).forEachOrdered(marc -> {
            LocalDateTime paraComp = LocalDateTime.of(marc.getFechaHora().getYear(), marc.getFechaHora().getMonth(), marc.getFechaHora().getDayOfMonth(), marc.getEmpleado().getOficina().getHoraDeEntrada().getHours(), marc.getEmpleado().getOficina().getHoraDeEntrada().getMinutes());
            if (marc.getFechaHora().isAfter(paraComp)) {
                irrespons.add(marc);
            }
        });
//        for (Marcacion marc:marcacionesList) {
//            if (marc.getTipo()==MarcacionTipo.ENTRADA ) {
//                LocalDateTime paraComp = LocalDateTime.of(marc.getFechaHora().getYear(),marc.getFechaHora().getMonth(),marc.getFechaHora().getDayOfMonth(),marc.getEmpleado().getOficina().getHoraDeEntrada().getHours(),marc.getEmpleado().getOficina().getHoraDeEntrada().getMinutes());
//                if (marc.getFechaHora().isAfter(paraComp)) {
//                    irrespons.add(marc);
//                }
//            }
//        }
        return irrespons;
    }

    @Override
    public void ordenar() {
        Collections.sort(marcacionesList);
    }

    @Override
    public void ordenar(Comparator comparator) {
        Collections.sort(marcacionesList, comparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(marcacionesList);
        return sb.toString();
    }

}
