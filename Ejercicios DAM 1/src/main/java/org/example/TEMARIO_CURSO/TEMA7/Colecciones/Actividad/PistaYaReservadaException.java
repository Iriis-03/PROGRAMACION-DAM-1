package org.example.TEMARIO_CURSO.TEMA7.Colecciones.Actividad;

public class PistaYaReservadaException extends RuntimeException {
    public PistaYaReservadaException() {
        super("La pista ya está reservada a esa hora.");
    }
}
