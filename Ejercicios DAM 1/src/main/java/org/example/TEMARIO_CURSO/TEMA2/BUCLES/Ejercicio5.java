package org.example.TEMARIO_CURSO.TEMA2.BUCLES;

import java.util.Scanner;

public class Ejercicio5 {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = read.nextInt();

        System.out.println("La tabla de multiplicar del " + n + " es: ");

       for (int i = 1; i <= 10; i++){

           int resultado = n * i;


           System.out.println(n + " * " + i + " = " + resultado);
       }


    }
}
