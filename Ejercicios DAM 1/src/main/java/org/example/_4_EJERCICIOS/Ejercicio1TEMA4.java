package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Ejercicio1TEMA4 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = read.nextInt();

        System.out.println(cubo(num));

    }

    public static int cubo(int num){

        return num * num * num;
    }
}
