package org.example.PRUEBAS;

import java.util.Random;

public class MatricesPruebaaa2 {

    static void main(String[] args) {

        Random aleatorio = new Random();

        int num_aleatorio = aleatorio.nextInt(1, 6);

        int[][] matriz = new int[num_aleatorio][num_aleatorio];


        System.out.println("Matriz: ");

        for (int i = 0; i < num_aleatorio; i++) {

            for (int j = 0; j < num_aleatorio; j++) {

                matriz[i][j] = aleatorio.nextInt(1, 6);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int tamanyo_filas;

        System.out.println("Suma de filas: ");

        for (int i = 0; i < num_aleatorio; i++) {

            tamanyo_filas = 0;

            for (int j = 0; j < num_aleatorio; j++) {

                tamanyo_filas += matriz[i][j];


            }
            System.out.println("Fila " + (i + 1) + ": " + tamanyo_filas);
        }

        System.out.println();

        int tamanyo_colum;

        System.out.println("Suma de columnas: ");

        for (int i = 0; i < num_aleatorio; i++) {

            tamanyo_colum = 0;

            for (int j = 0; j < num_aleatorio; j++) {

                tamanyo_colum += matriz[j][i];

            }
            System.out.println("Columna " + (i + 1) + ": " + tamanyo_colum);
        }


    }
}
