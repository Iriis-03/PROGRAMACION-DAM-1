package org.example.TEMARIO_CURSO.TEMA3.MATRICES;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

    static void main() {

        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(2, 9);

        int matriz[][] = new int[filas][filas];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio.nextInt(1,51);
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }


        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
    }
}

