package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Matrices1 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Matriz: ");

        for (int i = 0; i < 3; i++) {

            System.out.println();

            for (int j = 0; j < 3; j++) {

                 matriz[i][j] = read.nextInt();

            }

        }

        System.out.println("Número a buscar: ");
        int num_buscar = read.nextInt();

        bucle:

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (num_buscar == matriz[i][j]){
                    System.out.println("Salida: ");
                    System.out.println("El número " + num_buscar + " se encunetra en la posición " + "(" + i + ", " + j + ").");
                    break bucle;
                }


            }


        }




    }



}
