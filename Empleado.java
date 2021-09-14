/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.floripa;

import java.util.Objects;

/**
 *
 * @author Alexis
 */
public class Empleado implements Comparable<Empleado> {

    private String nombre, apellido, documento;
    private int legajo;
    private Oficina oficina;

    public Empleado(String nombre, String apellido, String documento, int legajo, Oficina oficina) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.legajo = legajo;
        this.oficina = oficina;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", documento=").append(documento);
        sb.append(", legajo=").append(legajo);
        sb.append(", oficina=").append(oficina);
        sb.append('}');
        sb.append("\n");

        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Empleado o) {
        return new Integer(this.getLegajo()).compareTo(o.getLegajo());
    }
}
