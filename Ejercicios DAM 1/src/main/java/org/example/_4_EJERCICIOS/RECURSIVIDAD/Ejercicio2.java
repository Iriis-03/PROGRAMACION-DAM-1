package org.example._4_EJERCICIOS.RECURSIVIDAD;

public class Ejercicio2 {

    static int limite = 10;

    static void main(String[] args) {

        System.gc(); //Limpia lo que pueda antes de medir

        long inicioEjecucion = System.nanoTime();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        imprimir(1);

        long finEjecucion = System.nanoTime();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes");

        System.gc(); //Limpia lo que pueda antes de medir

        inicioEjecucion = System.nanoTime();
        memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        imprimir_bucle();

        finEjecucion = System.nanoTime();
        memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes");


    }

    public static void imprimir(int inicio){

        if (inicio <= limite){

            System.out.println(inicio);
            imprimir(inicio + 1);

        }
    }

    public static void imprimir_bucle(){

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
