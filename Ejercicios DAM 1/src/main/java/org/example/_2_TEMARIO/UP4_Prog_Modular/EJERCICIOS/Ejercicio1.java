package org.example._2_TEMARIO.UP4_Prog_Modular.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio1 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número...");
        int numero = read.nextInt();
        int resultado = cubo(numero);
        System.out.println(resultado);

    }

    public static int cubo(int numero){

        return numero * numero * numero;
    }

}
