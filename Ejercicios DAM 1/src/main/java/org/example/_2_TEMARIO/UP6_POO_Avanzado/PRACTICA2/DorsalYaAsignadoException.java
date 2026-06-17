package org.example._2_TEMARIO.UP6_POO_Avanzado.PRACTICA2;

public class DorsalYaAsignadoException extends RuntimeException {
    public DorsalYaAsignadoException(Equipos equipos) {
        super("¡Lo siento! Ese dorsal ya está ocupado por un jugador del mismo equipo (" + equipos + ").");
    }
}
