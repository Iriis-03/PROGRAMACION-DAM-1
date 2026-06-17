package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Ejercicio5TEMA2 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Jugador 1, introduce una frase: ");
        String frase = read.nextLine();

        for (int i = 0; i < 10; i++) {

            System.out.println("Jugador 2, introduce una palabra");
            String palabra = read.next();

            if (frase.contains(palabra)){
                System.out.println("¡enhorabuena, has acertado una palabra!");
                System.out.println("La palabra " + palabra + " está contenida en la frase " + frase);
            } else {
                System.out.println("Intento fallido");
            }
        }

    }
}
