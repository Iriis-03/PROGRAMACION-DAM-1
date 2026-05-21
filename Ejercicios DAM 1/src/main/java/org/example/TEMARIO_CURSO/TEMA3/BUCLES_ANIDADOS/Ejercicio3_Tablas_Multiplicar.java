package org.example.TEMARIO_CURSO.TEMA3.BUCLES_ANIDADOS;

import java.util.Scanner;

public class Ejercicio3_Tablas_Multiplicar {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce número máximo...");
        int maximo = read.nextInt();

        tabla:
        for (int i = 1; i <= 9; i++){
            System.out.println("*************");
            System.out.println("Tabla del " + i);

            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));

                if (maximo < (i * j)){
                    break tabla;
                }

            }
        }
    }
}
