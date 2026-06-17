package org.example._2_TEMARIO.UP3_Estructuras_Datos.BUCLES_ANIDADOS;

import java.util.Scanner;

public class Ejercicio4_Num_Primos {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce número máximo de m: ");
        int m = read.nextInt();

        primos:
        for (int i = 2; i <= m; i++){

            for (int j = 2; j < i; j++){

                if (i % j == 0){
                    continue primos;
                }
            }

            System.out.print(i + " ");
        }
    }
}
