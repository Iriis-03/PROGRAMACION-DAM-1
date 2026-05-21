package org.example.TEMARIO_CURSO.TEMA1;

import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        try {

            System.out.println("Introduce las horas trabajadas, por favor");
            double horas = read.nextDouble();

            System.out.println("Introduce la tarifa por hora, por favor");
            double tarifa = read.nextDouble();

            double salario = horas * tarifa;

            System.out.println("Salario: " + salario + "€");
        } catch (Exception e) {
            System.out.println("El formato no es de texto");
        }
    }
}

