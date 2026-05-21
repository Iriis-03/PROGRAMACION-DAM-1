package org.example.TEMARIO_CURSO.REPASO_RECU.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_Arrays {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] vector_original = new int[]{6, 34, 2, 83, 51};

        System.out.println("Array original: " + Arrays.toString(vector_original));

        System.out.println("Ingresa el índice a eliminar: ");
        int num_borrar = read.nextInt();

        int[] vector_nuevo = new int[vector_original.length - 1];

        int aux = 0;

        for (int i = 0; i < vector_original.length; i++) {

            if (i == num_borrar){
                aux = 1;
            } else {
                vector_nuevo[i - aux] = vector_original[i];
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(vector_nuevo));

    }
}
