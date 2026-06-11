package org.example.PRUEBAS;

import java.util.Random;

public class MatricesPruebaa2 {

    static void main(String[] args) {

        Random aleatorio = new Random();

        int num_aleatorio = aleatorio.nextInt(1, 6);

        int[][] matriz = new int[num_aleatorio][num_aleatorio];

        System.out.println("Matriz: ");

        for (int i = 0; i < num_aleatorio; i++) {

            for (int j = 0; j < num_aleatorio; j++) {




            }
        }

        System.out.println();

        System.out.println("Suma de filas: ");

        int tamanyo_filas;

        for (int i = 0; i < num_aleatorio; i++) {

            tamanyo_filas = 0;

            for (int j = 0; j < num_aleatorio; j++) {

                int suma_filas = matriz[i][j] += tamanyo_filas;

                System.out.println("Fila " + i + ": " + suma_filas);

            }
        }

        System.out.println();

        int tamanyo_colum;

        for (int i = 0; i < num_aleatorio; i++) {

            tamanyo_colum = 0;

            for (int j = 0; j < num_aleatorio; j++) {

                int suma_colum = matriz[j][i] += tamanyo_colum;

                System.out.println("Fila " + i + ": " + suma_colum);

            }
        }


    }
}
