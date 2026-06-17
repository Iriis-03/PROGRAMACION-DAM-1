package org.example._2_TEMARIO.UP2_Estructuras_Control.STRINGS;

import java.util.Scanner;

public class Ejercicio1_TEMA2 {

    public static void main(){

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = read.nextLine();

        int longitud = frase.length();
        System.out.println("La longitud del texto es de " + longitud + " carácteres");

        String frase_reemplazos = frase.replace(" ", "");
        System.out.println(frase_reemplazos);

        String mitad1 = frase.substring(0, longitud/2);
        System.out.println(mitad1);

        String mitad2 = frase.substring(longitud/2, longitud);
        System.out.println(mitad2);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        System.out.println();

    }
}

