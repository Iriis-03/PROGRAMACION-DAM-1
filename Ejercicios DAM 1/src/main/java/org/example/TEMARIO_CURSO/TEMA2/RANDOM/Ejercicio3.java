package org.example.TEMARIO_CURSO.TEMA2.RANDOM;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce un rango mínimo y máximo");
        System.out.println("Mínimo: ");
        int min = read.nextInt();
        System.out.println("Máximo: ");
        int max = read.nextInt();

        int num = aleatorio.nextInt(min, max + 1);
        System.out.println("Número generado: " + num);
    }
}
