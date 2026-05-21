package org.example.TEMARIO_CURSO.REPASO_RECU.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7_Arrays {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] vector_original1 = new int[]{1, 2, 3};

        int[] vector_original2 = new int[]{4, 5, 6};

        System.out.println("Array1: " + Arrays.toString(vector_original1));

        System.out.println("Array1: " + Arrays.toString(vector_original2));

        int[] vector_nuevo = new int[vector_original1.length + vector_original2.length];


        for (int i = 0; i < vector_nuevo.length; i++) {

            if (i <= vector_original1.length - 1){
                vector_nuevo[i] = vector_original1[i];
            } else {
                vector_nuevo[i] = vector_original2[i - vector_original1.length];
            }
        }

        System.out.println("Array combinado: " + Arrays.toString(vector_nuevo));
    }
}
