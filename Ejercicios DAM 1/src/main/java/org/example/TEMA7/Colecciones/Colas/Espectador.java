package org.example.TEMA7.Colecciones.Colas;

public class Espectador {

    private int edad;

    public Espectador(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Ejercicio2Colas{" +
                "edad=" + edad +
                '}';
    }
}
