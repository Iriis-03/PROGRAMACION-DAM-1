package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Ejercicio1TEMA1_Prueba2 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double salario_base = 0;
        double salario_total = 0;
        double salario_extra = 0;
        int horas;
        double tarifa;

        do {

            System.out.println("Introduzca las Horas: ");
            horas = read.nextInt();
            break;

        } while(true);

        do {

            System.out.println("Introduzca la Tarifa por hora: ");
            tarifa = read.nextInt();
            break;

        } while (true);

        if (horas > 40){
            salario_base = 40 * tarifa;
            salario_extra = (horas - 40) * 1.5 * tarifa;
            salario_total = salario_base + salario_extra;
        } else {
            salario_total = horas * tarifa;
        }

        System.out.println("Salario: " + salario_total + "€");

    }
}
