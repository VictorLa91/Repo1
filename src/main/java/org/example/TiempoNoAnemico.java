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

    public String imprimirFechaLarga() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        return fecha.format(formatter);
    }

    public String imprimirFechaCorta() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatter);
    }

    public String imprimirHoraActual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaActual.format(formatter);
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
