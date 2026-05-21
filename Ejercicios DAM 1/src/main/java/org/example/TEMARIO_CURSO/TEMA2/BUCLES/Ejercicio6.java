package org.example.TEMARIO_CURSO.TEMA2.BUCLES;

import java.util.Scanner;

public class Ejercicio6 {

    static void main() {

        Scanner read = new Scanner(System.in);



        System.out.println("¿Cuántos números quieres sumar?");
        int cantidad = read.nextInt();

        int suma = 0;

        for (int i = 1; i <= cantidad; i++){

            System.out.print("Inserta nº" + i + " = ");
            int n = read.nextInt();

            suma = suma + n;
        }

        System.out.println("---------------------");
        System.out.println("El resultado es: " + suma);
    }
}
