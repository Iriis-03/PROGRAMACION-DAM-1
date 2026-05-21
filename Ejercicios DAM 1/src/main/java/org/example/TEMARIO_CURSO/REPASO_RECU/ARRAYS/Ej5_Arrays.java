package org.example.TEMARIO_CURSO.REPASO_RECU.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5_Arrays {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] vector_original = new int[]{1, 2, 3, 4, 5};

        System.out.println("Array original: " + Arrays.toString(vector_original));

        int[] vector_nuevo = new int[vector_original.length];

        for (int i = 0; i < vector_original.length; i++) {

            if (i == vector_original.length - 1){
                vector_nuevo[0] = vector_original[i];
            } else {
                vector_nuevo[i + 1] = vector_original[i];
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(vector_nuevo));

    }
}
