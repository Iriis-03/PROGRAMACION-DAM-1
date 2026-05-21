package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio4 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce un número: ");
            num[i] = read.nextInt();
        }

        if (num[0] == num[1] || num[0] == num[2] || num[1] == num[2]){
            System.out.println("ERROR: hay números introducidos que son iguales" );
        } else if (num[0] < num[1]) {
           if (num[0] < num[2]){
               System.out.println("El mínimo es el número " + num[0]);
           } else {
               System.out.println("El mínimo es el número " + num[2]);
           }
        } else if (num[1] < num[2]) {
            System.out.println("El mínimo es el número " + num[1]);
        } else {
            System.out.println("El mínimo es el número " + num[2]);
        }
    }
}
