package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Caracteres5 {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        int intentos = 10;

        System.out.println("Jugador 1, introduce una frase: ");
        String frase = read.nextLine();

        do {
            System.out.println("Jugador 2, introduce una palabra: ");
            String palabra = read.nextLine();

            if (frase.contains(palabra)){
                System.out.println("¡enhorabuena, has acertado una palabra!");
                break;
            } else {
                System.out.println("Intento fallido " + (intentos--) + " restantes");
            }

        } while (intentos != 0);

    }
}
