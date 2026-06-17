package org.example._4_EJERCICIOS;

import java.util.Random;

public class Matrices2 {

    static void main(String[] args) {

        Random aleatorio = new Random();

        int num_ale = aleatorio.nextInt(1, 6);

        int[][] matriz = new int[num_ale][num_ale];

        System.out.println("Matriz: ");

        for (int i = 0; i < num_ale; i++) {

            for (int j = 0; j < num_ale; j++) {

                matriz[i][j] = aleatorio.nextInt(1, 6);

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();
        }






        int total_fila;

        System.out.println("Suma de filas: ");

        for (int i = 0; i < num_ale; i++) {

            total_fila = 0;

            for (int j = 0; j < num_ale; j++) {

                total_fila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + total_fila);
        }


        int total_colum;

        System.out.println("Suma de columnas: ");

        for (int i = 0; i < num_ale; i++) {

            total_colum = 0;

            for (int j = 0; j < num_ale; j++) {

                total_colum += matriz[j][i];
            }
            System.out.println("Columna " + (i + 1) + ": " + total_colum);
        }

    }
}
