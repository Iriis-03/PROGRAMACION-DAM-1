package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Random;

public class Ejercicio1TEMA3 {

    static void main(String[] args) {

        Random aleatorio = new Random();

        int[] elementos = new int[8];

        int resultado = 0;

        for (int i = 0; i < 8; i++) {
            elementos[i] = aleatorio.nextInt(0,501);
            if (i == elementos.length - 1){
                System.out.println(elementos[i]);
            } else {
                System.out.print(elementos[i] + ", ");
            }
            resultado += elementos[i];
        }

        System.out.println();
        System.out.println("La suma de los elementos es: " + resultado);
    }
}
