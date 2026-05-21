package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class PruebaEjercicioPorquePierdoAlPadelTEMA3 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int suma = 0;
        String culpa[];
        System.out.println("Introduce el porcentaje de los 4 factores externos (compi-pista-pala-pelota):");
        do {
            culpa = read.nextLine().split(" ");

            if (culpa.length != 4) {
                System.out.println("Debesd e introducir 4 factores externos.");
                continue;
            }

            suma = 0;
            for (int i = 0; i < culpa.length; i++) {
                suma += Integer.parseInt(culpa[i]);
            }

            if (suma >= 100) {
                System.out.println("La suma de los factores externos debe de ser menor que 100.");
                continue;
            }

        } while (suma >= 100 || culpa.length != 4);

        System.out.println("======================================");
        System.out.println("Tienes un " + (100 - suma) + "% de culpa.");

    }
}