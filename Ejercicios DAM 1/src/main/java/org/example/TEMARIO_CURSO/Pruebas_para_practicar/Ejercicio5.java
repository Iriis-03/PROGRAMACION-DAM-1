package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio5 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num1 = read.nextInt();

        System.out.println("Introduce un número: ");
        int num2 = read.nextInt();

        try {
            int resultado = num1 / num2;
                System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("ERROR: no se puede dividir entre 0");
        }



    }



}
