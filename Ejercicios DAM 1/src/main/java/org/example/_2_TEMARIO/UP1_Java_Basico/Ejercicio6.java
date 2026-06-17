package org.example._2_TEMARIO.UP1_Java_Basico;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main (){

        Scanner read = new Scanner(System.in);

        int base = 0;
        int altura = 0;
        double area;

        do  {

            System.out.println("Introduce el valor de la base del triángulo");
            base = read.nextInt();

            if (base <= 0)
                System.out.println("El valor de la base tiene que ser positivo");

        }while (base <= 0);

        do  {

            System.out.println("Introduce el valor de la altura del triángulo");
            altura = read.nextInt();

            if (altura <= 0)
                System.out.println("El valor de la altura tiene que ser positivo");

        }while (altura <= 0);

        area = (base * altura) / 2;

        System.out.println("El área del triángulo es " + area);
    }

        }

