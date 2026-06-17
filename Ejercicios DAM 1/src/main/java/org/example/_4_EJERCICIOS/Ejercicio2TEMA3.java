package org.example._4_EJERCICIOS;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2TEMA3 {

    static void main(String[] args) {

        Random aleatorio = new Random();

        int[] elementos = new int[8];

        for (int i = 0; i < 8; i++) {
            elementos[i] = aleatorio.nextInt(0,501);

        }
        System.out.println(Arrays.toString(elementos));
        System.out.println();

        int[] array_invertida = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            array_invertida[i] = elementos[elementos.length - 1 - i];
        }

        System.out.println(Arrays.toString(array_invertida));
    }
}
