package org.example.PRUEBAS;

import java.util.Scanner;

public class MatricesPrueba1 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Matriz: ");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                int num_matriz = read.nextInt();
                matriz[i][j] = num_matriz;

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Número a buscar: ");
        int num_buscar = read.nextInt();

        System.out.println("Salida: ");
        num_encontrado:

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (num_buscar == matriz[i][j]){
                    System.out.println("El número " + num_buscar + " se encuentra en la posición " + "(" + i + ", " + j + ")");
                    break num_encontrado;
                }
            }
        }
    }
}
