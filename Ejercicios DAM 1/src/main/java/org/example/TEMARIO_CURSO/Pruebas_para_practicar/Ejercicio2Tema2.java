package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio2Tema2 {

    static void main() {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el número de horas laborales: ");
        double horas = read.nextInt();

        System.out.println("Introduce la tarifa por hora: ");
        double tarifa = read.nextDouble();

        double salario = horas * tarifa;

        if (horas > 40){
            double horas_extra = horas - 40;
            horas_extra = horas_extra * tarifa * 1.5;
            horas = 40 * tarifa;
            double salario_extra = horas_extra + horas;
            System.out.println("Salario: " + salario_extra + "€");
        } else {
            System.out.println("Salario: " + salario + "€");
        }



    }
}
