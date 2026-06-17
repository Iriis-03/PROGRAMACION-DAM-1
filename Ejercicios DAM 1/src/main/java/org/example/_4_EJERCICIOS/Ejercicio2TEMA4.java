package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Ejercicio2TEMA4 {

    static void main(String[] args) {

        int resultado;

        do {
            resultado = menu();
        } while (resultado != 5);
    }

    public static int menu(){
        Scanner read = new Scanner(System.in);

        System.out.println("¿Qué quieres cenar hoy?");
        System.out.println("***********************");
        System.out.println("    [1] -> Carne");
        System.out.println("    [2] -> Pescado");
        System.out.println("    [3] -> Tortilla");
        System.out.println("    [4] -> Pasta");
        System.out.println("    [5] -> Salir");
        System.out.println("***********************");
        System.out.println("Elige la opción que prefieras:");
        int opcion = read.nextInt();

        switch (opcion){

            case 1:
                System.out.println("¡Hoy cenas CARNE!");
                System.out.println("***********************");
                return 1;
            case 2:
                System.out.println("¡Hoy cenas PESCADO!");
                System.out.println("***********************");
                return 2;
            case 3:
                System.out.println("¡Hoy cenas TORTILLA!");
                System.out.println("***********************");
                return 3;
            case 4:
                System.out.println("¡Hoy cenas PASTA!");
                System.out.println("***********************");
                return 4;
            case 5:
                return 5;
            default:
                return -1;
        }

    }
}
