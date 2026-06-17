package org.example._2_TEMARIO.UP7_Colecciones_Funcional.Actividad;

public class PistaYaReservadaException extends RuntimeException {
    public PistaYaReservadaException() {
        super("La pista ya está reservada a esa hora.");
    }
}
