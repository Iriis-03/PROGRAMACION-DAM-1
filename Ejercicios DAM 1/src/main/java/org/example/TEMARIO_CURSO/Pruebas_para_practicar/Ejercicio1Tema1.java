package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio1Tema1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el número de horas laborales: ");
        int horas = read.nextInt();

        System.out.println("Introduce la tarifa por hora: ");
        double tarifa = read.nextDouble();

        double salario_bruto = horas * tarifa;

        System.out.println(salario_bruto);

    }
}
