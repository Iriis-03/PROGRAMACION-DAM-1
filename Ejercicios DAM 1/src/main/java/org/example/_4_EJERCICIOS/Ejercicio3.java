package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Ejercicio3 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = read.nextInt();

        if (num > 0){
            System.out.println("El número " + num + " es... " + " ¡POSITIVO!");
        } else if (num < 0){
            System.out.println("El número " + num + " es... " + "¡NEGATIVO!");
        } else {
            System.out.println("El número " + num + " es... " + "¡NATURAL!");
        }
    }
}
