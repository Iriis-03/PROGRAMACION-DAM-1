package org.example._2_TEMARIO.UP3_Estructuras_Datos.MATRICES;

import java.util.Arrays;
import java.util.Scanner;

public class Rellenar_Matriz {

    static void main() {

        Scanner read = new Scanner(System.in);

        String[][] nombres = new String[2][3];

        for (int i = 0; i < nombres.length; i++) {
            String[] fila = read.next().split(";");

            if (fila.length == nombres[i].length){
                for (int j = 0; j < nombres[i].length; j++) {
                    nombres[i][j] = fila[j];
                }
            } else {
                System.out.println("Error. Longitud incorrecta");
                i--;
            }
        }
        for (String[] fila : nombres){
            System.out.println(Arrays.toString(fila));
        }
    }
}
