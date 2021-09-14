/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.floripa;

import java.time.LocalDateTime;

/**
 *
 * @author Alexis
 */
public class Marcacion implements Comparable<Marcacion>{
    private int numero;
    private Empleado empleado;
    private LocalDateTime fechaHora;
    private MarcacionTipo tipo;

    public Marcacion(int numero, Empleado empleado, LocalDateTime fechaHora, MarcacionTipo tipo) {
        this.numero = numero;
        this.empleado = empleado;
        this.fechaHora = fechaHora;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public MarcacionTipo getTipo() {
        return tipo;
    }

    public void setTipo(MarcacionTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marcacion{numero=").append(numero);
        sb.append(", empleado=").append(empleado);
        sb.append(", fechaHora=").append(fechaHora);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Marcacion other = (Marcacion) obj;
        return this.numero == other.numero;
    }

    @Override
    public int compareTo(Marcacion o) {
            return this.fechaHora.compareTo(o.getFechaHora());
    }
    
}
