package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Ejercicio1TEMA2 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase: ");
        String frase = read.nextLine();

        System.out.println("********************************");

        String mitad1 = frase.substring(0, frase.length()/ 2);
        String concat = frase.substring(frase.length()/2, frase.length());
        String mayus = frase.toUpperCase();

        System.out.println("Texto original: " + frase);
        System.out.println("La longitud del texto es: " + frase.length());

        System.out.println("Texto sin espacios: " + frase.replace(" ", ""));
        System.out.println("Primera mitad de texto es " + mitad1 + " y la segunda mitad del texto es " + concat);
        System.out.println("Longitud mitad 1: " + mitad1.length());
        System.out.println("Longitud mitad 2: " + concat.length());
        System.out.println("Texto a mayúsculas: " + mayus);

    }
}
