package org.example.PRUEBA_EXAMENES;

import java.util.Scanner;

public class PartidoSquash {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        int contador_A = 0;
        int contador_B = 0;

        System.out.println("Introduce los tantos para cada jugador: ");
        String tanteo = read.nextLine();

        if (!tanteo.matches(".*[^F]F ")){

        for (int i = 0; i < tanteo.length(); i++) {

            char character = tanteo.charAt(i);

                if (character == 'A'){
                    contador_A++;
                } else if (character == 'B'){
                    contador_B++;
                } else if (character == 'S'){
                    System.out.println(contador_A + "-" + contador_B);
                } else if (character == 'F') {
                    System.out.println(contador_A + "-" + contador_B);
                }

            }

        } else {
            System.out.println("El formato no es correcto.");
        }

    }
}
