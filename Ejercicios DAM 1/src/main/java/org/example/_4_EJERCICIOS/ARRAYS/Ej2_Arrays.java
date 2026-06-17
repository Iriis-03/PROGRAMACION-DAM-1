package org.example._4_EJERCICIOS.ARRAYS;

import java.util.Arrays;

public class Ej2_Arrays {

    static void main(String[] args) {

        int[] vector_original = new int[]{3, 8, 4, 12, 7};

        System.out.println("Array original: " + Arrays.toString(vector_original));

        int[] vector_invertido = new int[5];

        for (int i = 0; i < vector_original.length; i++) {

            vector_invertido[i] = vector_original[vector_original.length - i - 1];
        }

        System.out.println("Array invertido: " + Arrays.toString(vector_invertido));

    }
}
