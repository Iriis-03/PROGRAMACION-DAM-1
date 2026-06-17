package org.example.PRUEBAS;

import java.util.Scanner;

public class Caracteres1 {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("INTRODUCE UNA PALABRA O FRASE: ");
        String palabra_frase = read.nextLine();

        System.out.println("Texto original: " + palabra_frase);
        System.out.println("La longitud del texto es: " + (palabra_frase.length()));
        System.out.println("Texto sin espacios: " + palabra_frase.replace(" ", ""));
        System.out.print("Texto dividido en 2 mitades: " + "Primera mitad del texto es " + palabra_frase.substring(0, palabra_frase.length() / 2) + " y la segunda mitad del texto es " + palabra_frase.substring(palabra_frase.length() / 2, palabra_frase.length()));

    }
}
