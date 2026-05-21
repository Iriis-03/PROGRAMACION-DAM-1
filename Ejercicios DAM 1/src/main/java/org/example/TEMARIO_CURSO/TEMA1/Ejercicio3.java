package org.example.TEMARIO_CURSO.TEMA1;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner read = new Scanner(System.in);
        int number = 0;


        try {
            System.out.println("Introduce un número, por favor");
            number = read.nextInt();
        } catch (Exception e) {
            System.out.println("El formato no es de texto");
        }
        if (number > 0) {
            System.out.println(number + " Es positivo");

            System.out.println("Introduce un número, por favor");
            number = read.nextInt();

            if (number > 0) {
                System.out.println("Es positivo");

            }

            if (number < 0) {
                System.out.println("Es negativo");
            }

            if (number == 0) {
                System.out.println("Es natural");
            }
        }
    }
}

