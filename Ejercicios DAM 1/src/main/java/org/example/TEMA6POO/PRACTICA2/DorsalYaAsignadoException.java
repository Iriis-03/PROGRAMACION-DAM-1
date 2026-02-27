package org.example.TEMA6POO.PRACTICA2;

public class DorsalYaAsignadoException extends RuntimeException {
    public DorsalYaAsignadoException(Equipos equipos) {
        super("¡Lo siento! Ese dorsal ya está ocupado por un jugador del mismo equipo (" + equipos + ").");
    }
}
