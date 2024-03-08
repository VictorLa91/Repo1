package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoAnemico {
    private LocalDate fecha;

    public TiempoAnemico() {
        this.fecha = LocalDate.now();
    }

    public String obtenerFechaLarga() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        return fecha.format(formatter);
    }

    public String obtenerFechaCorta() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatter);
    }
}
