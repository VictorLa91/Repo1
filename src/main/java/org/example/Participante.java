package org.example;

public class Participante {
    private String nombre;
    private String apellido;

    public void Participante() {
    }

    public void Participante(String Nombre, String Apellido) {
        this.apellido = Apellido;
        this.nombre = Nombre;
    }

    public String crearParticipante() {
        Participante participante = new Participante();
        return "qwer";
    }


}

