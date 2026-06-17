package org.example._2_TEMARIO.UP1_Java_Basico;

import java.util.Scanner;

public class Ejercicio2 {

    static void main () {

        final double JORNADA = 40;
        final double PLUS_EXTRA = 1.5;

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas, por favor");
        double horas = read.nextDouble();

        System.out.println("Introduce la tarifa por hora, por favor");
        double tarifa = read.nextDouble();


        if (horas>JORNADA){

            double extra = horas - JORNADA; //40
            double TARIFA_EXTRA = tarifa * PLUS_EXTRA;
            double SALARIO_EXTRA = extra * TARIFA_EXTRA;

            System.out.println("Salario (con extra): " + (SALARIO_EXTRA + JORNADA * tarifa) + "€");

        }else{
            double salario = horas * tarifa;
            System.out.println("Salario: " + salario + "€");

        }


    }
}

