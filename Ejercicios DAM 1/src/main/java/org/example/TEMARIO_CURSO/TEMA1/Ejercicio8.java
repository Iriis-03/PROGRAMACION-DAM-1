package org.example.TEMARIO_CURSO.TEMA1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main() {

        Scanner read = new Scanner(System.in);

        int a;
        int b;
        int c;
        String resultado;

        do  {

            System.out.println("Introduce el valor de la cara a del triángulo");
            a = read.nextInt();

            if (a <= 0)
                System.out.println("El valor de la base tiene que ser positivo");

        }while (a <= 0);


        do  {

            System.out.println("Introduce el valor de la cara b del triángulo");
            b = read.nextInt();

            if (b <= 0)
                System.out.println("El valor de la base tiene que ser positivo");

        }while (b <= 0);

        do  {

            System.out.println("Introduce el valor de la cara c del triángulo");
            c = read.nextInt();

            if (c <= 0)
                System.out.println("El valor de la base tiene que ser positivo");

        }while (c <= 0);


        if (a == b){
            resultado = "equilátero";
            if (a != c)
                resultado = "isósceles";
        }else{
            resultado = "escaleno";
            if (a == c)
                resultado = "isósceles";
            if (b == c)
                resultado = "isósceles";

        }

        System.out.println(resultado);

        }
    }
