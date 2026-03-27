package org.example.TEMA7.Colecciones.lambdas.Ejercicio2;

@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}
