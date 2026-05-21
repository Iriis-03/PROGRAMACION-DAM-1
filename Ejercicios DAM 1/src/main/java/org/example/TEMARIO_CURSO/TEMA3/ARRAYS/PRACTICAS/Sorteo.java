package org.example.TEMARIO_CURSO.TEMA3.ARRAYS.PRACTICAS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorteo {

    static void main() {

        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce los datos de tu boleto: ");
        String boleto = read.nextLine();

        boolean formato = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        String vector[] = boleto.split("[-/]");

        System.out.println(Arrays.toString(vector));
    }
}
