package org.example._2_TEMARIO.UP3_Estructuras_Datos.ARRAYS.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {

        Scanner read = new Scanner(System.in);

        int[] vector = {1, 3, 5, 7, 9};
        System.out.print("Array original: ");
        for (int i = 0 ; i < vector.length ; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.print("Introduce la posición a eliminar: ");
        int[] vector_2 = new int[vector.length - 1];
        int borrar = read.nextInt();


        for (int i = 0; i < vector_2.length ; i++) {
            if (i >= borrar) {
                vector_2[i] = vector[i + 1];
            } else {
                vector_2[i] = vector[i];
            }
        }

        System.out.print("Array resultante: ");
        for (int i = 0 ; i < vector_2.length ; i++) {
            System.out.print(vector_2[i] + " ");
        }
    }
}