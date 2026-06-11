package org.example.PRUEBAS.PRUEBA_EXAMEN;

import java.util.Scanner;

public class PartidoDeSquash {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Introduce los tantos para cada jugador: ");
        String tantos = read.next();

        int contador_tantos_A = 0;
        int contador_tantos_B = 0;

        if (tantos.matches(".*[^F]F")){
            for (int i = 0; i < tantos.length(); i++) {

                char character = tantos.charAt(i);

                if (character == 'A'){
                    contador_tantos_A++;
                } else if (character == 'B') {
                    contador_tantos_B++;
                } else if (character == 'S') {
                    System.out.print(contador_tantos_A + "-" + contador_tantos_B + " ");
                    contador_tantos_A = 0;
                    contador_tantos_B = 0;
                } else if (character == 'F') {
                    System.out.print(contador_tantos_A + "-" + contador_tantos_B);
                }
            }
        } else if (tantos.matches("F")){
            System.out.print(contador_tantos_A + "-" + contador_tantos_B);
        } else {
            System.out.println("El formato no es correcto.");
        }
    }
}
