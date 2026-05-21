package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio6 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        do {
            int b = 0;

            System.out.println("Introduce el valor de la base...");
            b = read.nextInt();

            if (b > 0){
                break;
            } else {
                System.out.println("El valor de la base tiene que ser positivo");
            }
        } while (true);
        do {
            int h = 0;

            System.out.println("Introduce el valor de la altura...");
            h = read.nextInt();

            if (h > 0){

            } else {
                System.out.println("El valor de la base tiene que ser positivo");
            }

        } while(true);



    }
}
