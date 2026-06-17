package org.example._2_TEMARIO.UP3_Estructuras_Datos.BUCLES_ANIDADOS;

import java.util.Scanner;

public class Ejercicio2_Arbol_Navidad {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce la altura...");
        int altura = read.nextInt();

        for (int i = 1; i <= altura; i++){

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
