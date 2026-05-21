package org.example.TEMARIO_CURSO.REPASO_RECU.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6_Arrays {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] vector_original = new int[]{1, 2, 3, 2, 1};

        System.out.println("Array: " + Arrays.toString(vector_original));

        boolean palindromo = true;

        for (int i = 0; i < vector_original.length; i++) {

            if (vector_original[i] == vector_original[vector_original.length - 1 - i]){
                palindromo = true;
            } else {
                palindromo = false;
                break;
            }

            if (i == vector_original.length - 2 - i || i == vector_original.length - i - 2){
                break;
            }
        }

        if (palindromo){
            System.out.println("Es simétrico: SI");
        } else {
            System.out.println("Es simétrico: NO");
        }
    }
}
