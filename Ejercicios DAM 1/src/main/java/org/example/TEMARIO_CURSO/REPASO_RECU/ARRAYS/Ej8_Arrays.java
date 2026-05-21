package org.example.TEMARIO_CURSO.REPASO_RECU.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8_Arrays {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] vector_original = new int[]{1, 2, 3, 5};

        System.out.println("Array original: " + Arrays.toString(vector_original));

        System.out.println("Ingresa el número a insertar: ");
        int num_insertar = read.nextInt();

        System.out.println("Ingresa la posición en la que quieres insertar el número [0-" + (vector_original.length - 1) + "]: ");
        int num_posicion = read.nextInt();

        System.out.println("Insertando número " + num_insertar + " en la posición " + num_posicion);

        int[] vector_nuevo = new int[vector_original.length + 1];

        int aux = 0;

        for (int i = 0; i < vector_original.length; i++) {

            if (i == num_posicion){
                vector_nuevo[i] = num_insertar;
                vector_nuevo[i + 1] = vector_original[i];
                aux = 1;
            } else {
                vector_nuevo[i + aux] = vector_original[i];
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(vector_nuevo));


    }
}
