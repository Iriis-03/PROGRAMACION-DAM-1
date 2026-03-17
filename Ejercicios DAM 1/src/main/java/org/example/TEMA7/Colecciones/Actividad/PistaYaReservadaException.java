package org.example.TEMA7.Colecciones.Actividad;

public class PistaYaReservadaException extends RuntimeException {
    public PistaYaReservadaException() {
        super("La pista ya está reservada a esa hora.");
    }
}
