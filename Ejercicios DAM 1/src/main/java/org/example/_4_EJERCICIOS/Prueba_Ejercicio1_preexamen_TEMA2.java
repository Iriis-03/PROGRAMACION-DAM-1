package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Prueba_Ejercicio1_preexamen_TEMA2 {

    static void main() {

        Scanner read = new Scanner(System.in);

        //Ejercicio 1. Programa que pida por teclado una cantidad de números a introducir (N).
        // Una vez introducidos, el programa debe informar de cuántos números son:
        //- mayores que 0.
        //- menores que 0.
        //- iguales a 0.

        System.out.println("Introduce una cantidad de números:");
        int cantidad = read.nextInt();

        int contador_mayor0 = 0;
        int contador_menor0 = 0;
        int contador_igual0 = 0;

        for (int i = 1; i <= cantidad; i++){

            System.out.print("Inserta nº " + i + " : ");
            int n = read.nextInt();

            if (n > 0)
                contador_mayor0 ++;

            if (n < 0)
                contador_menor0 ++;

            if (n == 0)
                contador_igual0 ++;


        }

        System.out.println("---------------------");
        System.out.println("Números mayores de 0: " + contador_mayor0);
        System.out.println("Números menores de 0: " + contador_menor0);
        System.out.println("Números iguales a 0: " + contador_igual0);
    }
}

