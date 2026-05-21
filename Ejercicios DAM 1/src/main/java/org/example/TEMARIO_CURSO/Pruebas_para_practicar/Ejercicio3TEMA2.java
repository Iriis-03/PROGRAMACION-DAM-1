package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio3TEMA2 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número (longitud variable): ");
        String N = read.next();

        System.out.println("Introduce la cantidad de dígitos que quieres eliminar");
        int m = read.nextInt();

        System.out.println(N.substring(0, N.length() - m));

    }
}
