package org.example.TEMA7.Colecciones.Sets;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio1Sets {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = read.nextLine();

        String[] frase_split = frase.toLowerCase().split(" ");
        LinkedHashSet<String> frase_ordenada = new LinkedHashSet<>(Arrays.asList(frase_split));

        System.out.println("Palabras únicas " + frase_ordenada);


    }
}
