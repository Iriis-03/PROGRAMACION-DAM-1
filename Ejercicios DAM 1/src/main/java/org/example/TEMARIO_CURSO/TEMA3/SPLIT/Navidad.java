package org.example.TEMARIO_CURSO.TEMA3.SPLIT;

import java.util.Scanner;

public class Navidad {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una palabra a imprimir...");
        String palabra = read.next();
        read.nextLine();
        String letras_vector[] = palabra.split("");

        System.out.println("Introduce la cantidad de letra a imprimir...");
        String cantidad = read.nextLine();
        String cantidad_vector[] = cantidad.split(" ");
        if (letras_vector.length == cantidad_vector.length){

            for (int i = 0; i < letras_vector.length; i++){

                for (int j = 0; j < Integer.parseInt(cantidad_vector[i]); j++){

                    System.out.print(letras_vector[i]);

                }
            }

        } else {
            System.out.println("La palabra y las cifras introducidas no coinciden.");
        }
    }
}
