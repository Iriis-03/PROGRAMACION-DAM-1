package org.example.TEMARIO_CURSO.TEMA3.ARRAYS.EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class RotarArray {

    static void main() {

        Scanner read = new Scanner(System.in);

        int[] original = {18, 36, 95, 42, 23};

        int longitud = original.length;

        int[] salida = new int[longitud];

        int posicion = 0;

        System.out.print("Introduce el número de posiciones en la que quieres que se desplacen los elementos de el array: ");
        int rotar = read.nextInt();

        for (int i = 0; i < longitud; i++) {
            if (rotar > 0){
                if (i + rotar >= longitud){
                    posicion = i + rotar - longitud;
                } else {
                    posicion = i + rotar;
                }
            } else {
                if (i + rotar < 0){
                    posicion = i + rotar + longitud;
                } else {
                    posicion = i + rotar;
                }
            }
            salida[posicion] = original[i];
        }
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(salida));
    }
}
