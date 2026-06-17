package org.example._2_TEMARIO.UP1_Java_Basico;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {

        Scanner read = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;

        boolean control = true;
        do {
            try {
                System.out.println("Introduce el numerador, por favor...");
                numerador = read.nextInt();
                System.out.println("Introduce el denominador, por favor...");
                denominador = read.nextInt();
                control = false;
            } catch (Exception e){
                System.out.println("El formato no es correcto");
            }read.nextLine();
        }while(control==true);

            int resultado = numerador / denominador;
            System.out.println(resultado);

            int numero = read.nextInt();
        System.out.println("El formato no es numérico");
    }
}

