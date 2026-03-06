package org.example.TEMA7.Colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio3Sets {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        String palabra = "";

        LinkedHashSet<String> set = new LinkedHashSet<>();

        while (!palabra.toLowerCase().equals("salir")){

            System.out.println("Escribe una URL visitada (o 'salir' para terminar): ");
            palabra = read.next();

            if (palabra.equals("salir")){
                break;
            }

            set.add(palabra);
        }

        System.out.println("Historial de navegación: ");

        int contador = 1;

        for (String url : set){

            System.out.println(contador + ". " + url);
            contador++;
        }
    }
}
