/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.floripa;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alexis
 */
public class ClienteFloripa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oficina ofi001 = new Oficina("Juzgado de faltas", Time.valueOf("08:00:59"), Time.valueOf("14:00:59"));
        Oficina ofi002 = new Oficina("Personal De Limpieza", Time.valueOf("08:30:59"), Time.valueOf("12:00:59"));
        Oficina ofi003 = new Oficina("Sistemas", Time.valueOf("07:00:59"), Time.valueOf("13:00:59"));
        List<Empleado> staff = new ArrayList();
        staff.add(new Empleado("Juan", "Buffa", "42465894", 100, ofi003));
        staff.add(new Empleado("Nunca", "Tarde", "28798544", 11, ofi003));
        staff.add(new Empleado("Ever", "Late", "26548978", 25, ofi002));
        staff.add(new Empleado("Camila", "Fredes", "43100201", 23, ofi001));
        staff.add(new Empleado("Alexis", "Perez", "42165070", 66, ofi002));
        MarcacionesAdmin registro = new MarcacionesAdmin();
        registro.marcacionesList.add(new Marcacion(10, staff.get(0), LocalDateTime.of(2019, Month.DECEMBER, 23, 7, 05), MarcacionTipo.ENTRADA));//tarde
        registro.marcacionesList.add(new Marcacion(135, staff.get(0), LocalDateTime.of(2019, Month.DECEMBER, 24, 6, 30), MarcacionTipo.ENTRADA));//temprano
        registro.marcacionesList.add(new Marcacion(24, staff.get(0), LocalDateTime.of(2019, Month.DECEMBER, 26, 13, 30), MarcacionTipo.SALIDA));//noImporta
        registro.marcacionesList.add(new Marcacion(00, staff.get(0), LocalDateTime.of(2019, Month.DECEMBER, 27, 10, 30), MarcacionTipo.SALIDA));//noImporta

        registro.marcacionesList.add(new Marcacion(16, staff.get(1), LocalDateTime.of(2019, Month.DECEMBER, 23, 6, 30), MarcacionTipo.ENTRADA));//temprano
        registro.marcacionesList.add(new Marcacion(198, staff.get(1), LocalDateTime.of(2019, Month.DECEMBER, 24, 6, 40), MarcacionTipo.ENTRADA));//temprano
        registro.marcacionesList.add(new Marcacion(45, staff.get(1), LocalDateTime.of(2019, Month.DECEMBER, 26, 13, 10), MarcacionTipo.SALIDA));//noImporta
        registro.marcacionesList.add(new Marcacion(1, staff.get(1), LocalDateTime.of(2019, Month.DECEMBER, 27, 15, 40), MarcacionTipo.SALIDA));//noImporta

        registro.marcacionesList.add(new Marcacion(25, staff.get(2), LocalDateTime.of(2019, Month.DECEMBER, 23, 8, 48), MarcacionTipo.ENTRADA));//tarde
        registro.marcacionesList.add(new Marcacion(165, staff.get(2), LocalDateTime.of(2019, Month.DECEMBER, 24, 9, 30), MarcacionTipo.ENTRADA));//tarde
        registro.marcacionesList.add(new Marcacion(54, staff.get(2), LocalDateTime.of(2019, Month.DECEMBER, 26, 11, 30), MarcacionTipo.SALIDA));//noImporta

        registro.marcacionesList.add(new Marcacion(19, staff.get(3), LocalDateTime.of(2019, Month.DECEMBER, 23, 7, 59), MarcacionTipo.ENTRADA));//temprano
        registro.marcacionesList.add(new Marcacion(132, staff.get(3), LocalDateTime.of(2019, Month.DECEMBER, 25, 14, 53), MarcacionTipo.SALIDA));//noImporta
        registro.marcacionesList.add(new Marcacion(69, staff.get(3), LocalDateTime.of(2019, Month.DECEMBER, 26, 14, 15), MarcacionTipo.SALIDA));//noImporta

        registro.marcacionesList.add(new Marcacion(124, staff.get(4), LocalDateTime.of(2019, Month.DECEMBER, 23, 8, 15), MarcacionTipo.ENTRADA));//temprano
        registro.marcacionesList.add(new Marcacion(25, staff.get(4), LocalDateTime.of(2019, Month.DECEMBER, 25, 13, 30), MarcacionTipo.SALIDA));//noImporta
        registro.marcacionesList.add(new Marcacion(99, staff.get(4), LocalDateTime.of(2019, Month.DECEMBER, 26, 12, 05), MarcacionTipo.SALIDA));//noImporta

        System.out.println(registro.empleados());
        System.out.println("\n");
        System.out.println("filtro por empleado: ");
        System.out.println(registro.filtroPorEmpleado(staff.get(3)));
        System.out.println("\n");
        System.out.println("Filtro por tipo de marcacion == SALIDA;");
        System.out.println(registro.filtroPorTipo(MarcacionTipo.SALIDA));
        System.out.println("\n");
        System.out.println("Llegaron tarde");
        System.out.println(registro.llegaronTarde());
        System.out.println("\n");
        Collections.sort(staff);
        System.out.println("staff ordenado segun legajo(por defecto)");
        System.out.println(staff);
        System.out.println("\n");
        System.out.println("staff ordenado por apellido");
        Collections.sort(staff, new EmpleadoApellidoNombreComparator());
        System.out.println(staff);
        System.out.println("\n");
        System.out.println("Marcaciones sin ordenamiento");
        System.out.println(registro.marcacionesList);
        System.out.println("\n");
        System.out.println("Marcacion por FechaHora(por defecto");
        registro.ordenar();
        System.out.println(registro.marcacionesList);
        registro.ordenar(new MarcacionEmpleadoComparator());
        System.out.println("Registro ordenado por apellido de empleado");
        System.out.println(registro);
        
    }
}
