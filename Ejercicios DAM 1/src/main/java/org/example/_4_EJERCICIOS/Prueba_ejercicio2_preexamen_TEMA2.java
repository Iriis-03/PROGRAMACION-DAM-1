package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Prueba_ejercicio2_preexamen_TEMA2 {

    static void main() {

        Scanner read = new Scanner(System.in);

        //Ejercicio 2. Programa que dados dos números introducidos por teclado, uno real (base)
        // -que puede ser positivo o negativo- y un entero positivo (exponente), saque por pantalla el resultado de la potencia.
        // Por ejemplo: 56
        //No se puede utilizar el operador de potencia.

        System.out.println("Introduce un número con decimales (base): ");
        double num_double = read.nextDouble();

        System.out.println("Introduce un número entero (exponente): ");
        int num_int = read.nextInt();

        double multiplicador = 1;

        for (int i = 0; i < num_int; i++){
            multiplicador = multiplicador * num_double;
        }

        System.out.println("El resultado de la potencia es: " + multiplicador);

    }
}
