package org.example.TEMARIO_CURSO.TEMA7.Colecciones.lambdas.Ejercicio2;

@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}
