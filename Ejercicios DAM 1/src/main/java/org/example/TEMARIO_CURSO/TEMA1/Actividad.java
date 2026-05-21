package org.example.TEMARIO_CURSO.TEMA1;

import java.util.Scanner;

public class Actividad {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor:");
        String name = read.nextLine();

        System.out.println("Introduce tu curso, por favor:");
        String course = read.next();

        System.out.println("Hola " + name + " bienvenido/a al curso " + course);


        System.out.println("Introduce un número, por favor:");
        int num1 = read.nextInt();

        System.out.println("Introduce un número, por favor:");
        int num2 = read.nextInt();

        //Opción 1

        System.out.println("El resultado es " + (num1+num2));

        //Opción 2

        int resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);
    }
}


