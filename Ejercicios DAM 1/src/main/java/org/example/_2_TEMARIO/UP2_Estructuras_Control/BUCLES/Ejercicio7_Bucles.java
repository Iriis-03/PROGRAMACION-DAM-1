package org.example._2_TEMARIO.UP2_Estructuras_Control.BUCLES;

import java.util.Scanner;

public class Ejercicio7_Bucles {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una palabra...");
        String palabra = read.next();
        int longitud = palabra.length();
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }
}