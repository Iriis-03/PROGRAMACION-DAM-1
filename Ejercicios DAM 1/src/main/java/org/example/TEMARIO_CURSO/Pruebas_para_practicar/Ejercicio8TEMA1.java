package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio8TEMA1 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;

        System.out.println("Introduce el tamaño del lado 1: ");
        lado1 = read.nextInt();

        System.out.println("Introduce el tamaño del lado 2: ");
        lado2 = read.nextInt();

        System.out.println("Introduce el tamaño del lado 3: ");
        lado3 = read.nextInt();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Es un triángulo isósceles");
        } else if ((lado1 == lado2 && lado3 != lado2) || (lado3 == lado2 && lado1 != lado2) || (lado3 == lado1 && lado3 != lado2)) {
            System.out.println("Es un triángulo equilátero");
        } else {
            System.out.println("Es un triángulo escaleno");
        }
    }
}
