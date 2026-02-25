package org.example.TEMA6POO.PRACTICA2;

public class DorsalYaAsignadoException extends RuntimeException {
    public DorsalYaAsignadoException() {
        super("El dorsal introducido ya está asignado");
    }
}
