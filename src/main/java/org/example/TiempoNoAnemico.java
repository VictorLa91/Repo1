package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {
    private LocalDate fecha;
    private LocalTime horaActual;

    public TiempoNoAnemico() {
        this.fecha = LocalDate.now();
        this.horaActual = LocalTime.now();
    }

    public void imprimirFechaLarga() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        System.out.println(fecha.format(formatter));
    }

    public void imprimirFechaCorta() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fecha.format(formatter));
    }

    public void imprimirHoraActual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora actual: " + horaActual.format(formatter));
    }

    public void sumarMinutos(int minutos) {
        this.horaActual = this.horaActual.plusMinutes(minutos);
    }

    public void restarMinutos(int minutos) {
        this.horaActual = this.horaActual.minusMinutes(minutos);
    }

    public void sumarDias(int dias) {
        this.fecha = this.fecha.plusDays(dias);
    }

    public void restarDias(int dias) {
        this.fecha = this.fecha.minusDays(dias);
    }

}
