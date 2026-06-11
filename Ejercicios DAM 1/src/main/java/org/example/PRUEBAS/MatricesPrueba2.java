package org.example.PRUEBAS;

import java.util.Random;

public class MatricesPrueba2 {

    static void main(String[] args) {

        Random aleatorio = new Random();

        int num_aleatorio = aleatorio.nextInt(1, 6);

        int[][] matriz = new int[num_aleatorio][num_aleatorio];

        System.out.println("Suma de filas: ");

        for (int i = 0; i < num_aleatorio; i++) {

           int filas = 0;

            for (int j = 0; j < num_aleatorio; j++) {
                filas += matriz[i][j];
                System.out.println(matriz[i][j] + " ");
            }

            System.out.println("Fila " + i + ": " + filas);

        }

        System.out.println("Suma de columnas: ");

        for (int i = 0; i < num_aleatorio; i++) {

            int colum = 0;

            for (int j = 0; j < num_aleatorio; j++) {
                colum += matriz[j][i];
                System.out.println(matriz[j][i] + " ");
            }

            System.out.println("Columna " + i + ": " + colum);

        }
    }
}
