package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Prueba_Ejercicio2_TEMA2 {
    //Desarrolla un programa que permita leer 2 cadenas de caracteres (palabras) diferentes y nos diga cual es la más larga.

    public static void main() {

        Scanner read = new Scanner(System.in);

        int longitud1 = 0;
        int longitud2 = 0;

        System.out.println("Introduce una palabra");
        String palabra1 = read.nextLine();

        System.out.println("Introduce otra palabra");
        String palabra2 = read.nextLine();

        longitud1 = palabra1.length();
        longitud2 = palabra2.length();

        if (longitud1 > longitud2) {
            System.out.println("La primera palabra es más larga que la segunda");
        } else if (longitud2 > longitud1) {
            System.out.println("La segunda palabra es más larga que la primera");
        } else {
            System.out.println("La dos palabras tienen la misma longitud");

        }
    }
}