package org.example._2_TEMARIO.UP7_Colecciones_Funcional.lambdas.Ejercicio2;

@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}
