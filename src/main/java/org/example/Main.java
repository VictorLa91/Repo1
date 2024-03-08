package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Objeto Anemico solo tiene metodos para obtener y setear los datos
        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        System.out.println("Fecha larga (Anémico): " + tiempoAnemico.obtenerFechaLarga());
        System.out.println("Fecha corta (Anémico): " + tiempoAnemico.obtenerFechaCorta());

        // Enfoque No Anémico tiene otros metodos que manejan la logica del negocio
        TiempoNoAnemico tiempoNoAnemico = new TiempoNoAnemico();
        System.out.print("Fecha larga (No Anémico): ");
        tiempoNoAnemico.imprimirFechaLarga();
        tiempoNoAnemico.sumarDias(2);
        tiempoNoAnemico.imprimirFechaLarga();
        System.out.print("Fecha corta (No Anémico): ");
        tiempoNoAnemico.imprimirFechaCorta();
        System.out.print("Tiempo resultante de agregar 10 minuto: ");
        tiempoNoAnemico.sumarMinutos(10);
        tiempoNoAnemico.imprimirHoraActual();
        System.out.print("Tiempo resultante de restarle 15 minutos: ");
        tiempoNoAnemico.restarMinutos(15);
        tiempoNoAnemico.imprimirHoraActual();

        TiempoR tiempoActual = TiempoR.ahora();
        System.out.println("Fecha larga: " + tiempoActual.obtenerFechaLarga());
        System.out.println("Fecha corta: " + tiempoActual.obtenerFechaCorta());
    }

}