package org.example._2_TEMARIO.UP3_Estructuras_Datos.MATRICES;

import java.util.Arrays;
import java.util.Random;

public class Matrices2 {

    static void main() {

        Random aleatorio = new Random();

        int[][] matriz = new int [aleatorio.nextInt(2, 9) ][aleatorio.nextInt(2, 9)];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio.nextInt(1,51);
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }
    }
}
