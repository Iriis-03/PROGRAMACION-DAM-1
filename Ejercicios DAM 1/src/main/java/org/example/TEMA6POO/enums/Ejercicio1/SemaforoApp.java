package org.example.TEMA6POO.enums.Ejercicio1;

public class SemaforoApp {

    static void main(String[] args) {
        Semaforo ahora = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {
            System.out.println(ahora.name());
            ahora = ahora.siguiente();
        }
    }
}
