package com.mycompany.floripa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class MarcacionesAdminAbstract {

    protected List<Marcacion> marcacionesList;

    public MarcacionesAdminAbstract() {
        marcacionesList = new ArrayList();
    }
 
    /**
     * Devuelve la cantidad de elementos en marcacionesList
     *
     * @return
     */
    public int size() {
        return marcacionesList.size();
    }

    /**
     * Agrega una marcación en marcacionesLis
     *
     * @param a
     */
    public void add(Marcacion a) {
        marcacionesList.add(a);
    }

    /**
     * Devuelve la marcación ubicada en index.
     *
     * @param index
     * @return
     */
    public Marcacion get(int index) {
        return marcacionesList.get(index);
    }

    /**
     * Quita y devuelve el elemento ubicado index.
     *
     * @param index
     * @return
     */
    public Marcacion remove(int index) {
        return marcacionesList.remove(index);
    }

    /**
     * Devuelve todos los empleados de los que se tiene registro de marcación
     * (No repetir resultados).
     *
     * @return
     */
    public abstract List<Empleado> empleados();

    /**
     * Devuelve todas las marcaciones de un empleado.
     *
     * @param empleado
     * @return
     */
    public abstract List<Marcacion> filtroPorEmpleado(Empleado empleado);

    /**
     * Devuelve todas las marcaciones del tipo especificado por parámetro.
     *
     * @param tipo
     * @return
     */
    public abstract List<Marcacion> filtroPorTipo(MarcacionTipo tipo);

    /**
     * Devuelve las marcaciones realizadas fuera del horario de ingreso.
     *
     * @return
     */
    public abstract List<Marcacion> llegaronTarde();

    /**
     * Ordena las marcaciones por el criterio especificado en compareTo()
     */
    public abstract void ordenar();

    /**
     * Ordena las marcaciones por el criterio pasado por parámetro.
     *
     * @param comparator
     */
    public abstract void ordenar(Comparator comparator);

    /**
     * Transforma en String todas las instancias de Marcación almacenadas en
     * marcacionesList
     *
     * @return
     */
    @Override
    public abstract String toString();
}
