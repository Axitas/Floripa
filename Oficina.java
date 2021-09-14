/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.floripa;

import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Alexis
 */
class Oficina {
    private String nombre;
    private Time horaDeEntrada,horaDeSalida;

    public Oficina(String nombre, Time horaDeEntrada, Time horaDeSalida) {
        this.nombre = nombre;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Time getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(Time horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public Time getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(Time horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
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
        final Oficina other = (Oficina) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Oficina{nombre=").append(nombre);
        sb.append(", horaDeEntrada=").append(horaDeEntrada);
        sb.append(", horaDeSalida=").append(horaDeSalida);
        sb.append('}');
        return sb.toString();
    }
    
    
}
