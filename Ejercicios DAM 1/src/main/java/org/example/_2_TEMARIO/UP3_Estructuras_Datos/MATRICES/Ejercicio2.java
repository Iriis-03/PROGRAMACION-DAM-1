package org.example._2_TEMARIO.UP3_Estructuras_Datos.MATRICES;

import java.util.Arrays;

public class Ejercicio2 {

    static void main(String[] args) {

        int[][] matrizA = {{1,2,3},{6,7,8},{10,8,15}};
        int[][] matrizB = {{5,1,4},{7,3,11},{11,12,13}};

        int matrizM[][] = new int[3][3];

        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){

                if (matrizA[i][j] > matrizB[i][j]){
                    matrizM[i][j] = matrizA[i][j];
                } else {
                    matrizM[i][j] = matrizB[i][j];
                }
            }
        }
        for (int fila[] : matrizM){
            System.out.println(Arrays.toString(fila));
        }
    }
}
