package org.example.TEMA7.Colecciones.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2Colas {

    static void main(String[] args) {

        Queue<String> cola_impresion = new LinkedList<>();

        cola_impresion.offer("Imprimir documento 1");
        cola_impresion.offer("Imprimir documento 2");
        cola_impresion.offer("Imprimir documento 3");
        cola_impresion.offer("Imprimir documento 4");
        cola_impresion.offer("Imprimir documento 5");

        while (!cola_impresion.isEmpty()){
            System.out.println("Estado inicial de la cola de impresión " + cola_impresion);
            System.out.println("Procesando: " + cola_impresion.poll());
            System.out.println("Estado de la cola después de procesar el trabajo: " + cola_impresion);
        }

        System.out.println("No hay más trabajos en la cola de impresión.");
    }
}
