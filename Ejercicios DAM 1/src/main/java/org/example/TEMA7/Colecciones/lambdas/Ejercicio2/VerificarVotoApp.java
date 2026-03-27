package org.example.TEMA7.Colecciones.lambdas.Ejercicio2;

public class VerificarVotoApp {

    static void main(String[] args) {

        VerificadorVoto lambdas = (nombre, edad) -> {
            System.out.print("Probando " + nombre + " con " + edad + " años... ");
            if (edad >= 18) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(lambdas.puedeVotar("Maria", 14));
    }
}
