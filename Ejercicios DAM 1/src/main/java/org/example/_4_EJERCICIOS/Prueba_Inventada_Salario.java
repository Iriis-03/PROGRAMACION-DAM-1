package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Prueba_Inventada_Salario {

    static void main() {

        Scanner read = new Scanner(System.in);

        int antiguedad = 0;

        System.out.println("Introduce el salario base mensual:");
        int salario_base = read.nextInt();

        System.out.println("Introduce los años de antigüedad:");
        antiguedad = read.nextInt();

        System.out.println("¿Ha cumplido los objetivos del mes?");
        boolean objetivos = read.nextBoolean();

        boolean continuar = true;
        int salario_final;
        int salario_final_objetivos = 0;

        if (antiguedad > 10) {
            salario_final = salario_base * 15 / 100 + salario_base;
        } else if (antiguedad >= 5) {
            salario_final = salario_base * 10 / 100 + salario_base;
        } else {
            salario_final = salario_base;
        }

        if (objetivos) {
            salario_final_objetivos = salario_final + 250;
        } else {
            salario_final_objetivos = salario_final;
            continuar = false;
        }
        System.out.println("Salario final: " + salario_final_objetivos + "€");
    }
}