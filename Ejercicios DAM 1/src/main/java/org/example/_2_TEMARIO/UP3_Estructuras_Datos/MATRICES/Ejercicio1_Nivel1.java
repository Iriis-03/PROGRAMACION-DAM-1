package org.example._2_TEMARIO.UP3_Estructuras_Datos.MATRICES;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_Nivel1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Introdece los valores de la matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = read.nextInt();
            }

        }

        for (int[] fila : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("******************************************");
        System.out.println("Introduce número a buscar: ");
        int num = read.nextInt();

        externo:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == num){
                    System.out.println("El numero " + num + " está en la posición (" + i + "," + j + ")");
                    break externo;
                }
            }

        }
        System.out.println("******************************************");
    }
}
