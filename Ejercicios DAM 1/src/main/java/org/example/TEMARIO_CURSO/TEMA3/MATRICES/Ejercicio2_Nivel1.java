package org.example.TEMARIO_CURSO.TEMA3.MATRICES;

import java.util.Random;

public class Ejercicio2_Nivel1 {

    static void main() {

        Random aleatorio = new Random();

        int[][] matriz = new int[aleatorio.nextInt(1,6)][aleatorio.nextInt(1,6)];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10,31);
            }
        }

        for (int fila[] : matriz){
            for (int num : fila){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Fila " + (i+1) + ": " + suma);
        }

        for (int i = 0; i <matriz[0].length ; i++) {
            suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[j][i];
            }
            System.out.println("Columna " + (i + 1) + ": " + suma);
        }

        suma = 0;
        int fila = aleatorio.nextInt(matriz.length - 1);
        for (int i = 0; i < matriz[0].length; i++) {
            suma += matriz[fila][i];
        }

        System.out.println("1 fila: " + suma);
    }
}
