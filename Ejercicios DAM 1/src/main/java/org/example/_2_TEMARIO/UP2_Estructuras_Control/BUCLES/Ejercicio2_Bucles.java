package org.example._2_TEMARIO.UP2_Estructuras_Control.BUCLES;

import java.util.Scanner;

public class Ejercicio2_Bucles {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = read.nextInt();

        for ( int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
