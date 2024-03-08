package org.example;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //La diferencia entre objtos anemicos y no anemicos es que los anemicos
        // solo funcionan como clases que almacenan datos y que solo tienen
        // como metodos los de acceso y modificacion de esos datos.
        // en cambio los no anemicos tiene mas funcionalidades y metodos que corresponden
        //  a la logica del negocio, como por ejemplo verificar, validar etc.


        // Objeto Anemico solo tiene metodos para obtener y setear los datos
        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        LocalDate fecha = tiempoAnemico.getFecha();
        // Ahora uso una clase que esta para convertir
        Formato conversor = new Formato();
        conversor.obtenerFechaCorta(fecha);
        System.out.println("Fecha larga (Anémico): " + conversor.obtenerFechaCorta(fecha));
        System.out.println("Fecha corta (Anémico): " + conversor.obtenerFechaLarga(fecha));

        // Prueba objeto no anemico. Tiene algunos metodos ademas de los getter y setter
        TiempoNoAnemico tiempoNoAnemico = new TiempoNoAnemico();
        System.out.println(tiempoNoAnemico.imprimirFechaLarga());
        tiempoNoAnemico.sumarDias(2);
        System.out.println(tiempoNoAnemico.imprimirFechaCorta());
        tiempoNoAnemico.restarDias(5);
        System.out.println(tiempoNoAnemico.imprimirFechaCorta());
        System.out.println(tiempoNoAnemico.imprimirFechaLarga());
        System.out.println(tiempoNoAnemico.imprimirFechaCorta());
        tiempoNoAnemico.sumarMinutos(10);
        System.out.println(tiempoNoAnemico.imprimirHoraActual());
        tiempoNoAnemico.restarMinutos(15);
        System.out.println(tiempoNoAnemico.imprimirHoraActual());


        // Es es una clase de tipo record. Segun lo que entendi es que son clases con
        // sus atributos de tipo final, es decir que no pueden ser modificados
        // por ende no tienen metodos para modificar los atributos o datos.
        // Cuando se instancian se pasan los atributos por parametros y se generan los getter
        // equals y hashcode automaticamente sin estar explicito en el codigo, ademas
        // de los metodos creados por nosotros propiamente.

        TiempoR tiempoActual = TiempoR.ahora();
        System.out.println("Fecha larga: " + tiempoActual.obtenerFechaLarga());
        System.out.println("Fecha corta: " + tiempoActual.obtenerFechaCorta());
        System.out.println(tiempoActual.toString());
        TiempoR tiempo2 = TiempoR.ahora();

        // cree otro objeto solo para usar el equals que no es "escrito como codigo"
        // en la clase records
        System.out.println(tiempoActual.equals(tiempo2));


    }


}